package com.test;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tbl_fwxx", schema = "text", catalog = "")
public class TblFwxxEntity {
    private int fwid;
    private Integer uid;
    private Integer jdid;
    private Integer lxid;
    private Integer shi;
    private Integer ting;
    private String fwxx;
    private String zj;
    private String title;
    private Timestamp date;
    private String telephone;
    private String lxr;

    @Id
    @Column(name = "fwid", nullable = false)
    public int getFwid() {
        return fwid;
    }

    public void setFwid(int fwid) {
        this.fwid = fwid;
    }

    @Basic
    @Column(name = "uid", nullable = true)
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "jdid", nullable = true)
    public Integer getJdid() {
        return jdid;
    }

    public void setJdid(Integer jdid) {
        this.jdid = jdid;
    }

    @Basic
    @Column(name = "lxid", nullable = true)
    public Integer getLxid() {
        return lxid;
    }

    public void setLxid(Integer lxid) {
        this.lxid = lxid;
    }

    @Basic
    @Column(name = "shi", nullable = true)
    public Integer getShi() {
        return shi;
    }

    public void setShi(Integer shi) {
        this.shi = shi;
    }

    @Basic
    @Column(name = "ting", nullable = true)
    public Integer getTing() {
        return ting;
    }

    public void setTing(Integer ting) {
        this.ting = ting;
    }

    @Basic
    @Column(name = "fwxx", nullable = true, length = 255)
    public String getFwxx() {
        return fwxx;
    }

    public void setFwxx(String fwxx) {
        this.fwxx = fwxx;
    }

    @Basic
    @Column(name = "zj", nullable = true, length = 255)
    public String getZj() {
        return zj;
    }

    public void setZj(String zj) {
        this.zj = zj;
    }

    @Basic
    @Column(name = "title", nullable = true, length = 255)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "date", nullable = true)
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Basic
    @Column(name = "telephone", nullable = true, length = 255)
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "lxr", nullable = true, length = 255)
    public String getLxr() {
        return lxr;
    }

    public void setLxr(String lxr) {
        this.lxr = lxr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TblFwxxEntity that = (TblFwxxEntity) o;

        if (fwid != that.fwid) return false;
        if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
        if (jdid != null ? !jdid.equals(that.jdid) : that.jdid != null) return false;
        if (lxid != null ? !lxid.equals(that.lxid) : that.lxid != null) return false;
        if (shi != null ? !shi.equals(that.shi) : that.shi != null) return false;
        if (ting != null ? !ting.equals(that.ting) : that.ting != null) return false;
        if (fwxx != null ? !fwxx.equals(that.fwxx) : that.fwxx != null) return false;
        if (zj != null ? !zj.equals(that.zj) : that.zj != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (telephone != null ? !telephone.equals(that.telephone) : that.telephone != null) return false;
        if (lxr != null ? !lxr.equals(that.lxr) : that.lxr != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fwid;
        result = 31 * result + (uid != null ? uid.hashCode() : 0);
        result = 31 * result + (jdid != null ? jdid.hashCode() : 0);
        result = 31 * result + (lxid != null ? lxid.hashCode() : 0);
        result = 31 * result + (shi != null ? shi.hashCode() : 0);
        result = 31 * result + (ting != null ? ting.hashCode() : 0);
        result = 31 * result + (fwxx != null ? fwxx.hashCode() : 0);
        result = 31 * result + (zj != null ? zj.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        result = 31 * result + (lxr != null ? lxr.hashCode() : 0);
        return result;
    }
}
