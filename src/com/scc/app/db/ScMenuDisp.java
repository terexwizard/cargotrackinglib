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
@Table(name = "SC_MENU_DISP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ScMenuDisp.findAll", query = "SELECT s FROM ScMenuDisp s")})
public class ScMenuDisp implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ScMenuDispPK scMenuDispPK;
    @Column(name = "MENU_DISP_TYPE")
    private String menuDispType;
    @Column(name = "MENU_DISP_SORT")
    private Short menuDispSort;
    @Column(name = "MENU_DISP_SYS")
    private String menuDispSys;
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

    public ScMenuDisp() {
    }

    public ScMenuDisp(ScMenuDispPK scMenuDispPK) {
        this.scMenuDispPK = scMenuDispPK;
    }

    public ScMenuDisp(String menuTempl, String menuCode, String menuDispCode) {
        this.scMenuDispPK = new ScMenuDispPK(menuTempl, menuCode, menuDispCode);
    }

    public ScMenuDispPK getScMenuDispPK() {
        return scMenuDispPK;
    }

    public void setScMenuDispPK(ScMenuDispPK scMenuDispPK) {
        this.scMenuDispPK = scMenuDispPK;
    }

    public String getMenuDispType() {
        return menuDispType;
    }

    public void setMenuDispType(String menuDispType) {
        this.menuDispType = menuDispType;
    }

    public Short getMenuDispSort() {
        return menuDispSort;
    }

    public void setMenuDispSort(Short menuDispSort) {
        this.menuDispSort = menuDispSort;
    }

    public String getMenuDispSys() {
        return menuDispSys;
    }

    public void setMenuDispSys(String menuDispSys) {
        this.menuDispSys = menuDispSys;
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
        hash += (scMenuDispPK != null ? scMenuDispPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScMenuDisp)) {
            return false;
        }
        ScMenuDisp other = (ScMenuDisp) object;
        if ((this.scMenuDispPK == null && other.scMenuDispPK != null) || (this.scMenuDispPK != null && !this.scMenuDispPK.equals(other.scMenuDispPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.scc.dbd.regcom.db.ScMenuDisp[ scMenuDispPK=" + scMenuDispPK + " ]";
    }
    
}
