/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scc.app.db;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Chu
 */
@Entity
@Table(name = "SC_USER_CERTIFICATE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ScUserCertificate.findAll", query = "SELECT s FROM ScUserCertificate s")})
public class ScUserCertificate implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ScUserCertificatePK scUserCertificatePK;
    @Column(name = "CERT_PROVIDER")
    private String certProvider;
    @Column(name = "CERT_APPLYTYPE")
    private String certApplytype;
    @Column(name = "CERT_TYPE")
    private String certType;
    @Column(name = "CERT_SERIAL")
    private String certSerial;
    @Column(name = "CERT_UID")
    private String certUid;
    @Column(name = "CERT_USERCN")
    private String certUsercn;
    @Column(name = "CERT_THUMBPRINT")
    private String certThumbprint;
    @Column(name = "CERT_ISSUEDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date certIssuedate;
    @Column(name = "CERT_EXPIREDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date certExpiredate;
    @Column(name = "CERT_ISSUER")
    private String certIssuer;
    @Lob
    @Column(name = "CERT_DATA")
    private byte[] certData;
    @Column(name = "CERT_STDATE")
    private String certStdate;
    @Column(name = "CERT_FNDATE")
    private String certFndate;
    @Column(name = "CERT_REG_SEQID")
    private Integer certRegSeqid;
    @Column(name = "USER_CERTSTAT")
    private String userCertstat;
    @Column(name = "REVOKETYPE")
    private String revoketype;
    @Column(name = "REVOKEREMARK")
    private String revokeremark;
    @Column(name = "REVOKEUSER")
    private String revokeuser;
    @Column(name = "REVOKEDATE")
    private String revokedate;
    @Column(name = "REVOKETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date revoketime;
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

    public ScUserCertificate() {
    }

    public ScUserCertificate(ScUserCertificatePK scUserCertificatePK) {
        this.scUserCertificatePK = scUserCertificatePK;
    }

    public ScUserCertificate(String userCode, int userCertSeqno) {
        this.scUserCertificatePK = new ScUserCertificatePK(userCode, userCertSeqno);
    }

    public ScUserCertificatePK getScUserCertificatePK() {
        return scUserCertificatePK;
    }

    public void setScUserCertificatePK(ScUserCertificatePK scUserCertificatePK) {
        this.scUserCertificatePK = scUserCertificatePK;
    }

    public String getCertProvider() {
        return certProvider;
    }

    public void setCertProvider(String certProvider) {
        this.certProvider = certProvider;
    }

    public String getCertApplytype() {
        return certApplytype;
    }

    public void setCertApplytype(String certApplytype) {
        this.certApplytype = certApplytype;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertSerial() {
        return certSerial;
    }

    public void setCertSerial(String certSerial) {
        this.certSerial = certSerial;
    }

    public String getCertUid() {
        return certUid;
    }

    public void setCertUid(String certUid) {
        this.certUid = certUid;
    }

    public String getCertUsercn() {
        return certUsercn;
    }

    public void setCertUsercn(String certUsercn) {
        this.certUsercn = certUsercn;
    }

    public String getCertThumbprint() {
        return certThumbprint;
    }

    public void setCertThumbprint(String certThumbprint) {
        this.certThumbprint = certThumbprint;
    }

    public Date getCertIssuedate() {
        return certIssuedate;
    }

    public void setCertIssuedate(Date certIssuedate) {
        this.certIssuedate = certIssuedate;
    }

    public Date getCertExpiredate() {
        return certExpiredate;
    }

    public void setCertExpiredate(Date certExpiredate) {
        this.certExpiredate = certExpiredate;
    }

    public String getCertIssuer() {
        return certIssuer;
    }

    public void setCertIssuer(String certIssuer) {
        this.certIssuer = certIssuer;
    }

    public byte[] getCertData() {
        return certData;
    }

    public void setCertData(byte[] certData) {
        this.certData = certData;
    }

    public String getCertStdate() {
        return certStdate;
    }

    public void setCertStdate(String certStdate) {
        this.certStdate = certStdate;
    }

    public String getCertFndate() {
        return certFndate;
    }

    public void setCertFndate(String certFndate) {
        this.certFndate = certFndate;
    }

    public Integer getCertRegSeqid() {
        return certRegSeqid;
    }

    public void setCertRegSeqid(Integer certRegSeqid) {
        this.certRegSeqid = certRegSeqid;
    }

    public String getUserCertstat() {
        return userCertstat;
    }

    public void setUserCertstat(String userCertstat) {
        this.userCertstat = userCertstat;
    }

    public String getRevoketype() {
        return revoketype;
    }

    public void setRevoketype(String revoketype) {
        this.revoketype = revoketype;
    }

    public String getRevokeremark() {
        return revokeremark;
    }

    public void setRevokeremark(String revokeremark) {
        this.revokeremark = revokeremark;
    }

    public String getRevokeuser() {
        return revokeuser;
    }

    public void setRevokeuser(String revokeuser) {
        this.revokeuser = revokeuser;
    }

    public String getRevokedate() {
        return revokedate;
    }

    public void setRevokedate(String revokedate) {
        this.revokedate = revokedate;
    }

    public Date getRevoketime() {
        return revoketime;
    }

    public void setRevoketime(Date revoketime) {
        this.revoketime = revoketime;
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
        hash += (scUserCertificatePK != null ? scUserCertificatePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScUserCertificate)) {
            return false;
        }
        ScUserCertificate other = (ScUserCertificate) object;
        if ((this.scUserCertificatePK == null && other.scUserCertificatePK != null) || (this.scUserCertificatePK != null && !this.scUserCertificatePK.equals(other.scUserCertificatePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.scc.nstda.rdconline.db.ScUserCertificate[ scUserCertificatePK=" + scUserCertificatePK + " ]";
    }
    
}
