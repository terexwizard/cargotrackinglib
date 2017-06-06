
package com.scc.app.db;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;



/**
 *
 * @author xtra
 * @version 1.00.00
 * 26/01/2556 21:25:06
 */
@Embeddable
public class ScProcLogPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PROC_DATE")
    private String procDate;
    @Basic(optional = false)
    @Column(name = "PROC_SEQNO")
    private int procSeqno;
    @Basic(optional = false)
    @Column(name = "PROC_RANDOM")
    private String procRandom;

    public ScProcLogPK() {
    }

    public ScProcLogPK(String procDate, int procSeqno, String procRandom) {
        this.procDate = procDate;
        this.procSeqno = procSeqno;
        this.procRandom = procRandom;
    }

    public String getProcDate() {
        return procDate;
    }

    public void setProcDate(String procDate) {
        this.procDate = procDate;
    }

    public int getProcSeqno() {
        return procSeqno;
    }

    public void setProcSeqno(int procSeqno) {
        this.procSeqno = procSeqno;
    }

    public String getProcRandom() {
        return procRandom;
    }

    public void setProcRandom(String procRandom) {
        this.procRandom = procRandom;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (procDate != null ? procDate.hashCode() : 0);
        hash += (int) procSeqno;
        hash += (procRandom != null ? procRandom.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScProcLogPK)) {
            return false;
        }
        ScProcLogPK other = (ScProcLogPK) object;
        if ((this.procDate == null && other.procDate != null) || (this.procDate != null && !this.procDate.equals(other.procDate))) {
            return false;
        }
        if (this.procSeqno != other.procSeqno) {
            return false;
        }
        if ((this.procRandom == null && other.procRandom != null) || (this.procRandom != null && !this.procRandom.equals(other.procRandom))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.scc.rd.newonlinedoc.db.ScProcLogPK[ procDate=" + procDate + ", procSeqno=" + procSeqno + ", procRandom=" + procRandom + " ]";
    }

}
