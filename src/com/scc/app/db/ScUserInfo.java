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
 * 20/07/2556  0:32:19
 */
@Entity
@Table(name = "SC_USER_INFO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ScUserInfo.findAll", query = "SELECT s FROM ScUserInfo s")})
public class ScUserInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USER_CODE")
    private String userCode;
    @Column(name = "REG_USERTYPE")
    private String regUsertype;
    @Column(name = "REG_USERTYPE_GRPREG")
    private String regUsertypeGrpreg;
    @Column(name = "REG_ROLETYPE")
    private String regRoletype;
    @Column(name = "REG_USERPOSI")
    private String regUserposi;
    @Column(name = "REG_USERTEL")
    private String regUsertel;
    @Column(name = "REG_USERFAX")
    private String regUserfax;
    @Column(name = "REG_USEREMAIL")
    private String regUseremail;
    @Column(name = "REG_USERDEPT")
    private String regUserdept;
    @Column(name = "COMP_REGNO")
    private String compRegno;
    @Column(name = "ADRBUILDING")
    private String adrbuilding;
    @Column(name = "ADRROOMNO")
    private String adrroomno;
    @Column(name = "ADRFLOOR")
    private String adrfloor;
    @Column(name = "ADRVILLAGE")
    private String adrvillage;
    @Column(name = "ADRNUMBER")
    private String adrnumber;
    @Column(name = "ADRMOO")
    private String adrmoo;
    @Column(name = "ADRSOI")
    private String adrsoi;
    @Column(name = "ADRROAD")
    private String adrroad;
    @Column(name = "ADRTUMBONCODE")
    private String adrtumboncode;
    @Column(name = "ADRAMPHURCODE")
    private String adramphurcode;
    @Column(name = "ADRPROVINCECODE")
    private String adrprovincecode;
    @Column(name = "ADRZIP")
    private String adrzip;
    @Column(name = "ADREMAIL")
    private String adremail;
    @Column(name = "FORM_GEN")
    private Integer formGen;
    @Column(name = "FORM_USER_SEQ")
    private Integer formUserSeq;
//    @Column(name = "USERROLE_CODE")
//    private String userroleCode;
    @Column(name = "USER_PRIVILEGE")
    private String userPrivilege;
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
    @Column(name = "REG_USERROLE")
    private String regUserrole;
    
    @Column(name = "CERTTYPE_GRP")
    private String certtypeGrp;

    public ScUserInfo() {
    }

    public ScUserInfo(String userCode) {
        this.userCode = userCode;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getRegUsertype() {
        return regUsertype;
    }

    public void setRegUsertype(String regUsertype) {
        this.regUsertype = regUsertype;
    }

    public String getRegUsertypeGrpreg() {
        return regUsertypeGrpreg;
    }

    public void setRegUsertypeGrpreg(String regUsertypeGrpreg) {
        this.regUsertypeGrpreg = regUsertypeGrpreg;
    }

    public String getRegRoletype() {
        return regRoletype;
    }

    public void setRegRoletype(String regRoletype) {
        this.regRoletype = regRoletype;
    }

    public String getRegUserposi() {
        return regUserposi;
    }

    public void setRegUserposi(String regUserposi) {
        this.regUserposi = regUserposi;
    }

    public String getRegUsertel() {
        return regUsertel;
    }

    public void setRegUsertel(String regUsertel) {
        this.regUsertel = regUsertel;
    }

    public String getRegUserfax() {
        return regUserfax;
    }

    public void setRegUserfax(String regUserfax) {
        this.regUserfax = regUserfax;
    }

    public String getRegUseremail() {
        return regUseremail;
    }

    public void setRegUseremail(String regUseremail) {
        this.regUseremail = regUseremail;
    }

    public String getRegUserdept() {
        return regUserdept;
    }

    public void setRegUserdept(String regUserdept) {
        this.regUserdept = regUserdept;
    }

    public String getCompRegno() {
        return compRegno;
    }

    public void setCompRegno(String compRegno) {
        this.compRegno = compRegno;
    }

    public String getAdrbuilding() {
        return adrbuilding;
    }

    public void setAdrbuilding(String adrbuilding) {
        this.adrbuilding = adrbuilding;
    }

    public String getAdrroomno() {
        return adrroomno;
    }

    public void setAdrroomno(String adrroomno) {
        this.adrroomno = adrroomno;
    }

    public String getAdrfloor() {
        return adrfloor;
    }

    public void setAdrfloor(String adrfloor) {
        this.adrfloor = adrfloor;
    }

    public String getAdrvillage() {
        return adrvillage;
    }

    public void setAdrvillage(String adrvillage) {
        this.adrvillage = adrvillage;
    }

    public String getAdrnumber() {
        return adrnumber;
    }

    public void setAdrnumber(String adrnumber) {
        this.adrnumber = adrnumber;
    }

    public String getAdrmoo() {
        return adrmoo;
    }

    public void setAdrmoo(String adrmoo) {
        this.adrmoo = adrmoo;
    }

    public String getAdrsoi() {
        return adrsoi;
    }

    public void setAdrsoi(String adrsoi) {
        this.adrsoi = adrsoi;
    }

    public String getAdrroad() {
        return adrroad;
    }

    public void setAdrroad(String adrroad) {
        this.adrroad = adrroad;
    }

    public String getAdrtumboncode() {
        return adrtumboncode;
    }

    public void setAdrtumboncode(String adrtumboncode) {
        this.adrtumboncode = adrtumboncode;
    }

    public String getAdramphurcode() {
        return adramphurcode;
    }

    public void setAdramphurcode(String adramphurcode) {
        this.adramphurcode = adramphurcode;
    }

    public String getAdrprovincecode() {
        return adrprovincecode;
    }

    public void setAdrprovincecode(String adrprovincecode) {
        this.adrprovincecode = adrprovincecode;
    }

    public String getAdrzip() {
        return adrzip;
    }

    public void setAdrzip(String adrzip) {
        this.adrzip = adrzip;
    }

    public String getAdremail() {
        return adremail;
    }

    public void setAdremail(String adremail) {
        this.adremail = adremail;
    }

    public Integer getFormGen() {
        return formGen;
    }

    public void setFormGen(Integer formGen) {
        this.formGen = formGen;
    }

    public Integer getFormUserSeq() {
        return formUserSeq;
    }

    public void setFormUserSeq(Integer formUserSeq) {
        this.formUserSeq = formUserSeq;
    }

    public String getCerttypeGrp() {
        return certtypeGrp;
    }

    public void setCerttypeGrp(String certtypeGrp) {
        this.certtypeGrp = certtypeGrp;
    }

    

    public String getUserPrivilege() {
        return userPrivilege;
    }

    public void setUserPrivilege(String userPrivilege) {
        this.userPrivilege = userPrivilege;
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
        if (!(object instanceof ScUserInfo)) {
            return false;
        }
        ScUserInfo other = (ScUserInfo) object;
        if ((this.userCode == null && other.userCode != null) || (this.userCode != null && !this.userCode.equals(other.userCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.scc.nstda.rdconline.db.ScUserInfo[ userCode=" + userCode + " ]";
    }

    public String getRegUserrole() {
        return regUserrole;
    }

    public void setRegUserrole(String regUserrole) {
        this.regUserrole = regUserrole;
    }

}
