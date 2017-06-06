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
 * 26/07/2555  21:43:41
 */
@Entity
@Table(name = "SC_FUNCTION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ScFunction.findAll", query = "SELECT s FROM ScFunction s")})
public class ScFunction implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FUNC_CODE")
    private String funcCode;
    @Column(name = "FUNC_TNAME")
    private String funcTname;
    @Column(name = "FUNC_SYS")
    private String funcSys;
    @Column(name = "FUNC_INITMODE")
    private String funcInitmode;
    @Column(name = "FUNC_PATHADD")
    private String funcPathadd;
    @Column(name = "FUNC_REMARK")
    private String funcRemark;
    @Column(name = "FUNC_ACTIVE")
    private String funcActive;
    @Column(name = "TENTUSER")
    private String tentuser;
    @Column(name = "TENTTIME")
    @Temporal(TemporalType.DATE)
    private Date tenttime;
    @Column(name = "TUPDLCNT")
    private Integer tupdlcnt;
    @Column(name = "TUPDUSER")
    private String tupduser;
    @Column(name = "TUPDTIME")
    @Temporal(TemporalType.DATE)
    private Date tupdtime;

    public ScFunction() {
    }

    public ScFunction(String funcCode) {
        this.funcCode = funcCode;
    }

    public String getFuncCode() {
        return funcCode;
    }

    public void setFuncCode(String funcCode) {
        this.funcCode = funcCode;
    }

    public String getFuncTname() {
        return funcTname;
    }

    public void setFuncTname(String funcTname) {
        this.funcTname = funcTname;
    }

    public String getFuncSys() {
        return funcSys;
    }

    public void setFuncSys(String funcSys) {
        this.funcSys = funcSys;
    }

    public String getFuncInitmode() {
        return funcInitmode;
    }

    public void setFuncInitmode(String funcInitmode) {
        this.funcInitmode = funcInitmode;
    }

    public String getFuncPathadd() {
        return funcPathadd;
    }

    public void setFuncPathadd(String funcPathadd) {
        this.funcPathadd = funcPathadd;
    }

    public String getFuncRemark() {
        return funcRemark;
    }

    public void setFuncRemark(String funcRemark) {
        this.funcRemark = funcRemark;
    }

    public String getFuncActive() {
        return funcActive;
    }

    public void setFuncActive(String funcActive) {
        this.funcActive = funcActive;
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
        hash += (funcCode != null ? funcCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScFunction)) {
            return false;
        }
        ScFunction other = (ScFunction) object;
        if ((this.funcCode == null && other.funcCode != null) || (this.funcCode != null && !this.funcCode.equals(other.funcCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.scc.dbd.regcom.db.ScFunction[ funcCode=" + funcCode + " ]";
    }
    
}
