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
public class ScRolePermisstionPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ROLE_CODE")
    private String roleCode;
    @Basic(optional = false)
    @Column(name = "FUNC_CODE")
    private String funcCode;

    public ScRolePermisstionPK() {
    }

    public ScRolePermisstionPK(String roleCode, String funcCode) {
        this.roleCode = roleCode;
        this.funcCode = funcCode;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getFuncCode() {
        return funcCode;
    }

    public void setFuncCode(String funcCode) {
        this.funcCode = funcCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roleCode != null ? roleCode.hashCode() : 0);
        hash += (funcCode != null ? funcCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScRolePermisstionPK)) {
            return false;
        }
        ScRolePermisstionPK other = (ScRolePermisstionPK) object;
        if ((this.roleCode == null && other.roleCode != null) || (this.roleCode != null && !this.roleCode.equals(other.roleCode))) {
            return false;
        }
        if ((this.funcCode == null && other.funcCode != null) || (this.funcCode != null && !this.funcCode.equals(other.funcCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.scc.dbd.regcom.db.ScRolePermisstionPK[ roleCode=" + roleCode + ", funcCode=" + funcCode + " ]";
    }
    
}
