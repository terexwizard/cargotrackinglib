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
@Table(name = "SC_ROLE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ScRole.findAll", query = "SELECT s FROM ScRole s")})
public class ScRole implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ROLE_CODE")
    private String roleCode;
    @Column(name = "ROLE_TNAME")
    private String roleTname;
    @Column(name = "ROLE_DESC")
    private String roleDesc;
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

    public ScRole() {
    }

    public ScRole(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleTname() {
        return roleTname;
    }

    public void setRoleTname(String roleTname) {
        this.roleTname = roleTname;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
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
        hash += (roleCode != null ? roleCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScRole)) {
            return false;
        }
        ScRole other = (ScRole) object;
        if ((this.roleCode == null && other.roleCode != null) || (this.roleCode != null && !this.roleCode.equals(other.roleCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.scc.dbd.regcom.db.ScRole[ roleCode=" + roleCode + " ]";
    }
    
}
