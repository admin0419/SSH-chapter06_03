package com.test;

import javax.persistence.*;

@Entity
@Table(name = "tbl_jd", schema = "text", catalog = "")
public class TblJdEntity {
    private int jdid;
    private String jd;

    @Id
    @Column(name = "jdid", nullable = false)
    public int getJdid() {
        return jdid;
    }

    public void setJdid(int jdid) {
        this.jdid = jdid;
    }

    @Basic
    @Column(name = "jd", nullable = true, length = 255)
    public String getJd() {
        return jd;
    }

    public void setJd(String jd) {
        this.jd = jd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TblJdEntity that = (TblJdEntity) o;

        if (jdid != that.jdid) return false;
        if (jd != null ? !jd.equals(that.jd) : that.jd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = jdid;
        result = 31 * result + (jd != null ? jd.hashCode() : 0);
        return result;
    }
}
