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
 * 05/04/2556  16:11:03
 */
@Entity
@Table(name = "SC_CONFIG")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ScConfig.findAll", query = "SELECT s FROM ScConfig s"),
    @NamedQuery(name = "ScConfig.findByCfgcode", query = "SELECT s FROM ScConfig s WHERE s.cfgcode = :cfgcode")})
public class ScConfig implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CFGID")
    private Integer cfgid;
    @Basic(optional = false)
    @Column(name = "CFGCODE")
    private String cfgcode;
    @Column(name = "CFGRVALUE")
    private String cfgrvalue;
    @Column(name = "CFGRDESC")
    private String cfgrdesc;
    @Column(name = "TENTUSER")
    private String tentuser;
    @Column(name = "TENTTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tenttime;
    @Column(name = "TUPDLCNT")
    private Integer tupdlcnt;
    @Column(name = "TUPDUSER")
    private String tupduser;
    @Column(name = "TUPDTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tupdtime;

    public ScConfig() {
    }

    public ScConfig(Integer cfgid) {
        this.cfgid = cfgid;
    }

    public ScConfig(Integer cfgid, String cfgcode) {
        this.cfgid = cfgid;
        this.cfgcode = cfgcode;
    }

    public Integer getCfgid() {
        return cfgid;
    }

    public void setCfgid(Integer cfgid) {
        this.cfgid = cfgid;
    }

    public String getCfgcode() {
        return cfgcode;
    }

    public void setCfgcode(String cfgcode) {
        this.cfgcode = cfgcode;
    }

    public String getCfgrvalue() {
        return cfgrvalue;
    }

    public void setCfgrvalue(String cfgrvalue) {
        this.cfgrvalue = cfgrvalue;
    }

    public String getCfgrdesc() {
        return cfgrdesc;
    }

    public void setCfgrdesc(String cfgrdesc) {
        this.cfgrdesc = cfgrdesc;
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
        hash += (cfgid != null ? cfgid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScConfig)) {
            return false;
        }
        ScConfig other = (ScConfig) object;
        if ((this.cfgid == null && other.cfgid != null) || (this.cfgid != null && !this.cfgid.equals(other.cfgid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.scc.nstda.rdconline.db.ScConfig[ cfgid=" + cfgid + " ]";
    }

}
