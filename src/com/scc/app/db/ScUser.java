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
 * @author Chu
 */
@Entity
@Table(name = "SC_USER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ScUser.findAll", query = "SELECT s FROM ScUser s")})
public class ScUser implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USER_CODE")
    private String userCode;
    @Column(name = "USER_PASSWD")
    private String userPasswd;
    @Column(name = "USER_PIN")
    private String userPin;
    @Column(name = "USER_TITLE")
    private String userTitle;
    @Column(name = "USER_TNM")
    private String userTnm;
    @Column(name = "USER_FNM")
    private String userFnm;
    @Column(name = "USER_LNM")
    private String userLnm;
    @Column(name = "USER_TNMEN")
    private String userTnmen;
    @Column(name = "USER_FNMEN")
    private String userFnmen;
    @Column(name = "USER_LNMEN")
    private String userLnmen;
    @Column(name = "USER_ACTIVE")
    private String userActive;
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

    public ScUser() {
    }

    public ScUser(String userCode) {
        this.userCode = userCode;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserPasswd() {
        return userPasswd;
    }

    public void setUserPasswd(String userPasswd) {
        this.userPasswd = userPasswd;
    }

    public String getUserPin() {
        return userPin;
    }

    public void setUserPin(String userPin) {
        this.userPin = userPin;
    }

    public String getUserTitle() {
        return userTitle;
    }

    public void setUserTitle(String userTitle) {
        this.userTitle = userTitle;
    }

    public String getUserTnm() {
        return userTnm;
    }

    public void setUserTnm(String userTnm) {
        this.userTnm = userTnm;
    }

    public String getUserFnm() {
        return userFnm;
    }

    public void setUserFnm(String userFnm) {
        this.userFnm = userFnm;
    }

    public String getUserLnm() {
        return userLnm;
    }

    public void setUserLnm(String userLnm) {
        this.userLnm = userLnm;
    }

    public String getUserTnmen() {
        return userTnmen;
    }

    public void setUserTnmen(String userTnmen) {
        this.userTnmen = userTnmen;
    }

    public String getUserFnmen() {
        return userFnmen;
    }

    public void setUserFnmen(String userFnmen) {
        this.userFnmen = userFnmen;
    }

    public String getUserLnmen() {
        return userLnmen;
    }

    public void setUserLnmen(String userLnmen) {
        this.userLnmen = userLnmen;
    }

    public String getUserActive() {
        return userActive;
    }

    public void setUserActive(String userActive) {
        this.userActive = userActive;
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
        hash += (userCode != null ? userCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScUser)) {
            return false;
        }
        ScUser other = (ScUser) object;
        if ((this.userCode == null && other.userCode != null) || (this.userCode != null && !this.userCode.equals(other.userCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.scc.nstda.rdconline.db.ScUser[ userCode=" + userCode + " ]";
    }
    
}
