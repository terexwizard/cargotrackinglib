/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scc.app.db;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author xtra
 * @version 1.00.00
 * 26/07/2555  21:43:41
 */
@Embeddable
public class ScUserPermitRolePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "USER_CODE")
    private String userCode;
    @Basic(optional = false)
    @Column(name = "ROLE_CODE")
    private String roleCode;

    public ScUserPermitRolePK() {
    }

    public ScUserPermitRolePK(String userCode, String roleCode) {
        this.userCode = userCode;
        this.roleCode = roleCode;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userCode != null ? userCode.hashCode() : 0);
        hash += (roleCode != null ? roleCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScUserPermitRolePK)) {
            return false;
        }
        ScUserPermitRolePK other = (ScUserPermitRolePK) object;
        if ((this.userCode == null && other.userCode != null) || (this.userCode != null && !this.userCode.equals(other.userCode))) {
            return false;
        }
        if ((this.roleCode == null && other.roleCode != null) || (this.roleCode != null && !this.roleCode.equals(other.roleCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.scc.dbd.regcom.db.ScUserPermitRolePK[ userCode=" + userCode + ", roleCode=" + roleCode + " ]";
    }
    
}
