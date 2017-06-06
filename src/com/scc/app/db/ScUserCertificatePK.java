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
 * @author Chu
 */
@Embeddable
public class ScUserCertificatePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "USER_CODE")
    private String userCode;
    @Basic(optional = false)
    @Column(name = "USER_CERT_SEQNO")
    private int userCertSeqno;

    public ScUserCertificatePK() {
    }

    public ScUserCertificatePK(String userCode, int userCertSeqno) {
        this.userCode = userCode;
        this.userCertSeqno = userCertSeqno;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public int getUserCertSeqno() {
        return userCertSeqno;
    }

    public void setUserCertSeqno(int userCertSeqno) {
        this.userCertSeqno = userCertSeqno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userCode != null ? userCode.hashCode() : 0);
        hash += (int) userCertSeqno;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScUserCertificatePK)) {
            return false;
        }
        ScUserCertificatePK other = (ScUserCertificatePK) object;
        if ((this.userCode == null && other.userCode != null) || (this.userCode != null && !this.userCode.equals(other.userCode))) {
            return false;
        }
        if (this.userCertSeqno != other.userCertSeqno) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.scc.nstda.rdconline.db.ScUserCertificatePK[ userCode=" + userCode + ", userCertSeqno=" + userCertSeqno + " ]";
    }
    
}
