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
 * 14/09/2556  15:37:55
 */
@Embeddable
public class ScUserLogonLockPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "USER_CODE")
    private String userCode;
    @Basic(optional = false)
    @Column(name = "LOGON_SEQ")
    private String logonSeq;

    public ScUserLogonLockPK() {
    }

    public ScUserLogonLockPK(String userCode, String logonSeq) {
        this.userCode = userCode;
        this.logonSeq = logonSeq;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getLogonSeq() {
        return logonSeq;
    }

    public void setLogonSeq(String logonSeq) {
        this.logonSeq = logonSeq;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userCode != null ? userCode.hashCode() : 0);
        hash += (logonSeq != null ? logonSeq.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScUserLogonLockPK)) {
            return false;
        }
        ScUserLogonLockPK other = (ScUserLogonLockPK) object;
        if ((this.userCode == null && other.userCode != null) || (this.userCode != null && !this.userCode.equals(other.userCode))) {
            return false;
        }
        if ((this.logonSeq == null && other.logonSeq != null) || (this.logonSeq != null && !this.logonSeq.equals(other.logonSeq))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.scc.nstda.rdconline.db.ScUserLogonLockPK[ userCode=" + userCode + ", logonSeq=" + logonSeq + " ]";
    }

}
