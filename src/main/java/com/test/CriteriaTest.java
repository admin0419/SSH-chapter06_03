package com.test;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;


import java.util.Iterator;
import java.util.List;

public class CriteriaTest {

    public static void main(String[] args) {
        Configuration conf=new Configuration().configure();
        SessionFactory sf=conf.buildSessionFactory();
        Session se=sf.openSession();

        Transaction tr=se.beginTransaction();
            for (int i=0;i<100000;i++){
                Car1Entity car1Entity=new Car1Entity();
                car1Entity.setName(i+""+i+i);
                se.save(car1Entity);
        }
           tr.commit();

            Query query=se.createQuery("select count(1) from Car1Entity");
            List list=query.list();
            Iterator iterator=list.iterator();

           Long aLong= (Long) iterator.next();
           System.out.println(aLong);

           Criteria criteria=se.createCriteria(Car1Entity.class);
           criteria.setFirstResult(aLong.intValue()-1);
           criteria.setMaxResults(1);

           List list1=criteria.list();
           Iterator iterator1=list1.iterator();

           while (iterator1.hasNext()){
               Car1Entity car1Entity2=(Car1Entity) iterator1.next();
               System.out.println(car1Entity2.getId()+"~" +car1Entity2.getName());
           }

           se.close();
           sf.close();






//        //条件
//        Criteria criteria=se.createCriteria(Car1Entity.class);
//        List list=criteria.list();
//
//        Iterator iterator=list.iterator();
//        while (iterator.hasNext()){
//            Car1Entity c1= (Car1Entity) iterator.next();
//            System.out.println(c1.getId() +","+c1.getName());
//        }
//
//         tr=se.beginTransaction();
//        //绑定变量
//        //insert into (?,?,?);
//        String string="update Car1Entity set name='criteria' where id=:id";
//        Query query=se.createQuery(string);
//        query.setParameter("id",200);
//        query.executeUpdate(); //这个方法适用于insert、delete、update
//        tr.commit();
//
//        criteria=se.createCriteria(Car1Entity.class);
//        criteria.add(Restrictions.eq("id",200));
//        list=criteria.list();
//
//        Iterator iterator1=list.iterator();
//        while (iterator1.hasNext()){
//            Car1Entity c1= (Car1Entity) iterator1.next();
//            System.out.println(c1.getId() +","+c1.getName());
//        }
    }
}
