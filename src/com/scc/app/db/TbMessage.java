/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.scc.app.db;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
 * 28/03/2556  20:11:58
 */
@Entity
@Table(name = "TB_MESSAGE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbMessage.findAll", query = "SELECT t FROM TbMessage t")})
public class TbMessage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MSG_CODE")
    private Short msgCode;
    @Column(name = "MSG_DESC")
    private String msgDesc;
    @Column(name = "MSG_FLAG")
    private String msgFlag;
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
    @Column(name = "MSG_MCODE")
    private String msgMcode;

    public TbMessage() {
    }

    public TbMessage(Short msgCode) {
        this.msgCode = msgCode;
    }

    public Short getMsgCode() {
        return msgCode;
    }

    public void setMsgCode(Short msgCode) {
        this.msgCode = msgCode;
    }

    public String getMsgDesc() {
        return msgDesc;
    }

    public void setMsgDesc(String msgDesc) {
        this.msgDesc = msgDesc;
    }

    public String getMsgFlag() {
        return msgFlag;
    }

    public void setMsgFlag(String msgFlag) {
        this.msgFlag = msgFlag;
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

    public String getMsgMcode() {
        return msgMcode;
    }

    public void setMsgMcode(String msgMcode) {
        this.msgMcode = msgMcode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (msgCode != null ? msgCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbMessage)) {
            return false;
        }
        TbMessage other = (TbMessage) object;
        if ((this.msgCode == null && other.msgCode != null) || (this.msgCode != null && !this.msgCode.equals(other.msgCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.scc.nstda.rdconline.db.TbMessage[ msgCode=" + msgCode + " ]";
    }

}
