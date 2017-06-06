/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.scc.app.db;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
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
 * 14/09/2556  15:37:55
 */
@Entity
@Table(name = "SC_USER_LOGON_LOCK")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ScUserLogonLock.findAll", query = "SELECT s FROM ScUserLogonLock s"),
    @NamedQuery(name = "ScUserLogonLock.findByActiveUserCode", query = "SELECT s FROM ScUserLogonLock s WHERE s.scUserLogonLockPK.userCode = :userCode and s.lockStatus = 'A' ")})

public class ScUserLogonLock implements Serializable {
    @Basic(optional = false)
   
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ScUserLogonLockPK scUserLogonLockPK;
    @Column(name = "LOGON_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date logonTime;
    @Column(name = "LOGON_LIMIT")
    private int logonLimit;
    @Column(name = "LOCK_STATUS")
    private String lockStatus;
    @Column(name = "SESSION_CLIENTIP")
    private String sessionClientip;
    @Column(name = "SESSION_INFO")
    private String sessionInfo;
    @Column(name = "SERVER_INFO")
    private String serverInfo;
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

    public ScUserLogonLock() {
    }

    public ScUserLogonLock(ScUserLogonLockPK scUserLogonLockPK) {
        this.scUserLogonLockPK = scUserLogonLockPK;
    }

    public ScUserLogonLock(String userCode, String logonSeq) {
        this.scUserLogonLockPK = new ScUserLogonLockPK(userCode, logonSeq);
    }

    public ScUserLogonLockPK getScUserLogonLockPK() {
        return scUserLogonLockPK;
    }

    public void setScUserLogonLockPK(ScUserLogonLockPK scUserLogonLockPK) {
        this.scUserLogonLockPK = scUserLogonLockPK;
    }

    public Date getLogonTime() {
        return logonTime;
    }

    public void setLogonTime(Date logonTime) {
        this.logonTime = logonTime;
    }

    public String getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(String lockStatus) {
        this.lockStatus = lockStatus;
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
        hash += (scUserLogonLockPK != null ? scUserLogonLockPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScUserLogonLock)) {
            return false;
        }
        ScUserLogonLock other = (ScUserLogonLock) object;
        if ((this.scUserLogonLockPK == null && other.scUserLogonLockPK != null) || (this.scUserLogonLockPK != null && !this.scUserLogonLockPK.equals(other.scUserLogonLockPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.scc.nstda.rdconline.db.ScUserLogonLock[ scUserLogonLockPK=" + scUserLogonLockPK + " ]";
    }

    public int getLogonLimit() {
        return logonLimit;
    }

    public void setLogonLimit(int logonLimit) {
        this.logonLimit = logonLimit;
    }

}
