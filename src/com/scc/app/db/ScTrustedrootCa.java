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
import javax.persistence.Lob;
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
 * 20/12/2556  16:39:11
 */
@Entity
@Table(name = "SC_TRUSTEDROOT_CA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ScTrustedrootCa.findAll", query = "SELECT s FROM ScTrustedrootCa s")})
public class ScTrustedrootCa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CA_PROVIDER_CODE")
    private String caProviderCode;
    @Column(name = "CA_PROVIDER_DESC")
    private String caProviderDesc;
    @Column(name = "CA_PROVIDER_CN")
    private String caProviderCn;
    @Column(name = "CA_PROVIDER_SORT")
    private Integer caProviderSort;
    @Column(name = "STATUS")
    private String status;
    @Lob
    @Column(name = "CERT_DATA")
    private byte[] certData;
    @Column(name = "CERT_FILENAME")
    private String certFilename;
    @Column(name = "CRL_URL")
    private String crlUrl;
    @Lob
    @Column(name = "CRL_DATA")
    private byte[] crlData;
    @Column(name = "CRL_TIME")
    private String crlTime;
    @Column(name = "CRL_UPDTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crlUpdtime;
    @Column(name = "CRL_FILENAME")
    private String crlFilename;
    @Column(name = "CRL_UPDSTAT")
    private String crlUpdstat;
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

    public ScTrustedrootCa() {
    }

    public ScTrustedrootCa(String caProviderCode) {
        this.caProviderCode = caProviderCode;
    }

    public String getCaProviderCode() {
        return caProviderCode;
    }

    public void setCaProviderCode(String caProviderCode) {
        this.caProviderCode = caProviderCode;
    }

    public String getCaProviderDesc() {
        return caProviderDesc;
    }

    public void setCaProviderDesc(String caProviderDesc) {
        this.caProviderDesc = caProviderDesc;
    }

    public String getCaProviderCn() {
        return caProviderCn;
    }

    public void setCaProviderCn(String caProviderCn) {
        this.caProviderCn = caProviderCn;
    }

    public Integer getCaProviderSort() {
        return caProviderSort;
    }

    public void setCaProviderSort(Integer caProviderSort) {
        this.caProviderSort = caProviderSort;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public byte[] getCertData() {
        return certData;
    }

    public void setCertData(byte[] certData) {
        this.certData = certData;
    }

    public String getCertFilename() {
        return certFilename;
    }

    public void setCertFilename(String certFilename) {
        this.certFilename = certFilename;
    }

    public String getCrlUrl() {
        return crlUrl;
    }

    public void setCrlUrl(String crlUrl) {
        this.crlUrl = crlUrl;
    }

    public byte[] getCrlData() {
        return crlData;
    }

    public void setCrlData(byte[] crlData) {
        this.crlData = crlData;
    }

    public String getCrlTime() {
        return crlTime;
    }

    public void setCrlTime(String crlTime) {
        this.crlTime = crlTime;
    }

    public Date getCrlUpdtime() {
        return crlUpdtime;
    }

    public void setCrlUpdtime(Date crlUpdtime) {
        this.crlUpdtime = crlUpdtime;
    }

    public String getCrlFilename() {
        return crlFilename;
    }

    public void setCrlFilename(String crlFilename) {
        this.crlFilename = crlFilename;
    }

    public String getCrlUpdstat() {
        return crlUpdstat;
    }

    public void setCrlUpdstat(String crlUpdstat) {
        this.crlUpdstat = crlUpdstat;
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
        hash += (caProviderCode != null ? caProviderCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScTrustedrootCa)) {
            return false;
        }
        ScTrustedrootCa other = (ScTrustedrootCa) object;
        if ((this.caProviderCode == null && other.caProviderCode != null) || (this.caProviderCode != null && !this.caProviderCode.equals(other.caProviderCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.scc.nstda.rdconline.db.ScTrustedrootCa[ caProviderCode=" + caProviderCode + " ]";
    }

}
