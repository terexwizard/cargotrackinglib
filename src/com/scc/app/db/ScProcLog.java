
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
 * 26/01/2556 21:25:05
 */
@Entity
@Table(name = "SC_PROC_LOG")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ScProcLog.findAll", query = "SELECT s FROM ScProcLog s")})
public class ScProcLog implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ScProcLogPK scProcLogPK;
    @Column(name = "PROC_USER_CODE")
    private String procUserCode;
    @Column(name = "PROC_USER_PIN")
    private String procUserPin;
    @Column(name = "PROC_USER_INFO")
    private String procUserInfo;
    @Column(name = "PROC_FUNC_CODE")
    private String procFuncCode;
    @Column(name = "PROC_TIMEIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date procTimein;
    @Column(name = "PROC_TIMEOUT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date procTimeout;
    @Column(name = "PROC_IPADDR")
    private String procIpaddr;
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
    @Column(name = "SESSION_INFO")
    private String sessionInfo;

    public ScProcLog() {
    }

    public ScProcLog(ScProcLogPK scProcLogPK) {
        this.scProcLogPK = scProcLogPK;
    }

    public ScProcLog(String procDate, int procSeqno, String procRandom) {
        this.scProcLogPK = new ScProcLogPK(procDate, procSeqno, procRandom);
    }

    public ScProcLogPK getScProcLogPK() {
        return scProcLogPK;
    }

    public void setScProcLogPK(ScProcLogPK scProcLogPK) {
        this.scProcLogPK = scProcLogPK;
    }

    public String getProcUserCode() {
        return procUserCode;
    }

    public void setProcUserCode(String procUserCode) {
        this.procUserCode = procUserCode;
    }

    public String getProcUserPin() {
        return procUserPin;
    }

    public void setProcUserPin(String procUserPin) {
        this.procUserPin = procUserPin;
    }

    public String getProcUserInfo() {
        return procUserInfo;
    }

    public void setProcUserInfo(String procUserInfo) {
        this.procUserInfo = procUserInfo;
    }

    public String getProcFuncCode() {
        return procFuncCode;
    }

    public void setProcFuncCode(String procFuncCode) {
        this.procFuncCode = procFuncCode;
    }

    public Date getProcTimein() {
        return procTimein;
    }

    public void setProcTimein(Date procTimein) {
        this.procTimein = procTimein;
    }

    public Date getProcTimeout() {
        return procTimeout;
    }

    public void setProcTimeout(Date procTimeout) {
        this.procTimeout = procTimeout;
    }

    public String getProcIpaddr() {
        return procIpaddr;
    }

    public void setProcIpaddr(String procIpaddr) {
        this.procIpaddr = procIpaddr;
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
        hash += (scProcLogPK != null ? scProcLogPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScProcLog)) {
            return false;
        }
        ScProcLog other = (ScProcLog) object;
        if ((this.scProcLogPK == null && other.scProcLogPK != null) || (this.scProcLogPK != null && !this.scProcLogPK.equals(other.scProcLogPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.scc.rd.newonlinedoc.db.ScProcLog[ scProcLogPK=" + scProcLogPK + " ]";
    }

    public String getSessionInfo() {
        return sessionInfo;
    }

    public void setSessionInfo(String sessionInfo) {
        this.sessionInfo = sessionInfo;
    }

}
