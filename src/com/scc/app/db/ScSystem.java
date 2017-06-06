/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scc.app.db;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author xtra
 * @version 1.00.00
 * 26/07/2555  21:43:41
 */
@Entity
@Table(name = "SC_SYSTEM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ScSystem.findAll", query = "SELECT s FROM ScSystem s")})
public class ScSystem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SYS_CODE")
    private String sysCode;
    @Column(name = "SYS_TNAME")
    private String sysTname;
    @Column(name = "SYS_ENAME")
    private String sysEname;
    @Column(name = "SYS_SORT")
    private Short sysSort;
    @Column(name = "TENTUSER")
    private String tentuser;
    @Column(name = "TENTTIME")
    @Temporal(TemporalType.DATE)
    private Date tenttime;
    @Column(name = "TUPDLCNT")
    private Integer tupdlcnt;
    @Column(name = "TUPDUSER")
    private String tupduser;
    @Column(name = "TUPDTIME")
    @Temporal(TemporalType.DATE)
    private Date tupdtime;

    public ScSystem() {
    }

    public ScSystem(String sysCode) {
        this.sysCode = sysCode;
    }

    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }

    public String getSysTname() {
        return sysTname;
    }

    public void setSysTname(String sysTname) {
        this.sysTname = sysTname;
    }

    public String getSysEname() {
        return sysEname;
    }

    public void setSysEname(String sysEname) {
        this.sysEname = sysEname;
    }

    public Short getSysSort() {
        return sysSort;
    }

    public void setSysSort(Short sysSort) {
        this.sysSort = sysSort;
    }

    public String getTentuser() {
        return tentuser;
    }

    public void setTentuser(String tentuser) {
        this.tentuser = tentuser;
    }

    public Date getTenttime() {
        return tenttime;
    }

    public void setTenttime(Date tenttime) {
        this.tenttime = tenttime;
    }

    public Integer getTupdlcnt() {
        return tupdlcnt;
    }

    public void setTupdlcnt(Integer tupdlcnt) {
        this.tupdlcnt = tupdlcnt;
    }

    public String getTupduser() {
        return tupduser;
    }

    public void setTupduser(String tupduser) {
        this.tupduser = tupduser;
    }

    public Date getTupdtime() {
        return tupdtime;
    }

    public void setTupdtime(Date tupdtime) {
        this.tupdtime = tupdtime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sysCode != null ? sysCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScSystem)) {
            return false;
        }
        ScSystem other = (ScSystem) object;
        if ((this.sysCode == null && other.sysCode != null) || (this.sysCode != null && !this.sysCode.equals(other.sysCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.scc.dbd.regcom.db.ScSystem[ sysCode=" + sysCode + " ]";
    }
    
}
