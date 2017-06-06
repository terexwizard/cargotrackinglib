
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
 * 03/06/2556 19:20:37
 */
@Entity
@Table(name = "SC_USER_SESSION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ScUserSession.findAll", query = "SELECT s FROM ScUserSession s"),
    @NamedQuery(name = "ScUserSession.findByUserCode", query = "SELECT s FROM ScUserSession s WHERE s.scUserSessionPK.userCode = :userCode"),
    @NamedQuery(name = "ScUserSession.findByUserSession", query = "SELECT s FROM ScUserSession s WHERE s.scUserSessionPK.userSession = :userSession")
    })
public class ScUserSession implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ScUserSessionPK scUserSessionPK;
    @Column(name = "SESSION_LOGONTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sessionLogontime;
    @Column(name = "SESSION_LASTTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sessionLasttime;
    @Column(name = "SESSION_CLIENTIP")
    private String sessionClientip;
    @Column(name = "SESSION_INFO")
    private String sessionInfo;
    @Column(name = "SERVER_INFO")
    private String serverInfo;
    @Column(name = "SESSION_STATUS")
    private String sessionStatus;
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

    public ScUserSession() {
    }

    public ScUserSession(ScUserSessionPK scUserSessionPK) {
        this.scUserSessionPK = scUserSessionPK;
    }

    public ScUserSession(String userCode, String userSession) {
        this.scUserSessionPK = new ScUserSessionPK(userCode, userSession);
    }

    public ScUserSessionPK getScUserSessionPK() {
        return scUserSessionPK;
    }

    public void setScUserSessionPK(ScUserSessionPK scUserSessionPK) {
        this.scUserSessionPK = scUserSessionPK;
    }

    public Date getSessionLogontime() {
        return sessionLogontime;
    }

    public void setSessionLogontime(Date sessionLogontime) {
        this.sessionLogontime = sessionLogontime;
    }

    public Date getSessionLasttime() {
        return sessionLasttime;
    }

    public void setSessionLasttime(Date sessionLasttime) {
        this.sessionLasttime = sessionLasttime;
    }

    public String getSessionClientip() {
        return sessionClientip;
    }

    public void setSessionClientip(String sessionClientip) {
        this.sessionClientip = sessionClientip;
    }

    public String getSessionInfo() {
        return sessionInfo;
    }

    public void setSessionInfo(String sessionInfo) {
        this.sessionInfo = sessionInfo;
    }

    public String getServerInfo() {
        return serverInfo;
    }

    public void setServerInfo(String serverInfo) {
        this.serverInfo = serverInfo;
    }

    public String getSessionStatus() {
        return sessionStatus;
    }

    public void setSessionStatus(String sessionStatus) {
        this.sessionStatus = sessionStatus;
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
        hash += (scUserSessionPK != null ? scUserSessionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScUserSession)) {
            return false;
        }
        ScUserSession other = (ScUserSession) object;
        if ((this.scUserSessionPK == null && other.scUserSessionPK != null) || (this.scUserSessionPK != null && !this.scUserSessionPK.equals(other.scUserSessionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.scc.rd.newonlinedoc.db.ScUserSession[ scUserSessionPK=" + scUserSessionPK + " ]";
    }

}
