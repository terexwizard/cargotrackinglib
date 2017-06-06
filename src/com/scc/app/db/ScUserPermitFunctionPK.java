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
public class ScUserPermitFunctionPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "USER_CODE")
    private String userCode;
    @Basic(optional = false)
    @Column(name = "FUNC_CODE")
    private String funcCode;

    public ScUserPermitFunctionPK() {
    }

    public ScUserPermitFunctionPK(String userCode, String funcCode) {
        this.userCode = userCode;
        this.funcCode = funcCode;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
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
        hash += (userCode != null ? userCode.hashCode() : 0);
        hash += (funcCode != null ? funcCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScUserPermitFunctionPK)) {
            return false;
        }
        ScUserPermitFunctionPK other = (ScUserPermitFunctionPK) object;
        if ((this.userCode == null && other.userCode != null) || (this.userCode != null && !this.userCode.equals(other.userCode))) {
            return false;
        }
        if ((this.funcCode == null && other.funcCode != null) || (this.funcCode != null && !this.funcCode.equals(other.funcCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.scc.dbd.regcom.db.ScUserPermitFunctionPK[ userCode=" + userCode + ", funcCode=" + funcCode + " ]";
    }
    
}
