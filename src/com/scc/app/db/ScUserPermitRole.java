/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scc.app.db;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "SC_USER_PERMIT_ROLE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ScUserPermitRole.findAll", query = "SELECT s FROM ScUserPermitRole s")})
public class ScUserPermitRole implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ScUserPermitRolePK scUserPermitRolePK;
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

    public ScUserPermitRole() {
    }

    public ScUserPermitRole(ScUserPermitRolePK scUserPermitRolePK) {
        this.scUserPermitRolePK = scUserPermitRolePK;
    }

    public ScUserPermitRole(String userCode, String roleCode) {
        this.scUserPermitRolePK = new ScUserPermitRolePK(userCode, roleCode);
    }

    public ScUserPermitRolePK getScUserPermitRolePK() {
        return scUserPermitRolePK;
    }

    public void setScUserPermitRolePK(ScUserPermitRolePK scUserPermitRolePK) {
        this.scUserPermitRolePK = scUserPermitRolePK;
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
        hash += (scUserPermitRolePK != null ? scUserPermitRolePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScUserPermitRole)) {
            return false;
        }
        ScUserPermitRole other = (ScUserPermitRole) object;
        if ((this.scUserPermitRolePK == null && other.scUserPermitRolePK != null) || (this.scUserPermitRolePK != null && !this.scUserPermitRolePK.equals(other.scUserPermitRolePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.scc.dbd.regcom.db.ScUserPermitRole[ scUserPermitRolePK=" + scUserPermitRolePK + " ]";
    }
    
}
