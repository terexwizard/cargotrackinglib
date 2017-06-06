
package com.scc.app.db;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;



/**
 *
 * @author xtra
 * @version 1.00.00
 * 03/06/2556 19:20:37
 */
@Embeddable
public class ScUserSessionPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "USER_CODE")
    private String userCode;
    @Basic(optional = false)
    @Column(name = "USER_SESSION")
    private String userSession;

    public ScUserSessionPK() {
    }

    public ScUserSessionPK(String userCode, String userSession) {
        this.userCode = userCode;
        this.userSession = userSession;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserSession() {
        return userSession;
    }

    public void setUserSession(String userSession) {
        this.userSession = userSession;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userCode != null ? userCode.hashCode() : 0);
        hash += (userSession != null ? userSession.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScUserSessionPK)) {
            return false;
        }
        ScUserSessionPK other = (ScUserSessionPK) object;
        if ((this.userCode == null && other.userCode != null) || (this.userCode != null && !this.userCode.equals(other.userCode))) {
            return false;
        }
        if ((this.userSession == null && other.userSession != null) || (this.userSession != null && !this.userSession.equals(other.userSession))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.scc.rd.newonlinedoc.db.ScUserSessionPK[ userCode=" + userCode + ", userSession=" + userSession + " ]";
    }

}
