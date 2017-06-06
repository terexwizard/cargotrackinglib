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
@Table(name = "SC_MENU")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ScMenu.findAll", query = "SELECT s FROM ScMenu s")})
public class ScMenu implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ScMenuPK scMenuPK;
    @Column(name = "MENU_TNAME")
    private String menuTname;
    @Column(name = "MENU_SNAME")
    private String menuSname;
    @Column(name = "MENU_SYS")
    private String menuSys;
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

    public ScMenu() {
    }

    public ScMenu(ScMenuPK scMenuPK) {
        this.scMenuPK = scMenuPK;
    }

    public ScMenu(String menuTempl, String menuCode) {
        this.scMenuPK = new ScMenuPK(menuTempl, menuCode);
    }

    public ScMenuPK getScMenuPK() {
        return scMenuPK;
    }

    public void setScMenuPK(ScMenuPK scMenuPK) {
        this.scMenuPK = scMenuPK;
    }

    public String getMenuTname() {
        return menuTname;
    }

    public void setMenuTname(String menuTname) {
        this.menuTname = menuTname;
    }

    public String getMenuSname() {
        return menuSname;
    }

    public void setMenuSname(String menuSname) {
        this.menuSname = menuSname;
    }

    public String getMenuSys() {
        return menuSys;
    }

    public void setMenuSys(String menuSys) {
        this.menuSys = menuSys;
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
        hash += (scMenuPK != null ? scMenuPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScMenu)) {
            return false;
        }
        ScMenu other = (ScMenu) object;
        if ((this.scMenuPK == null && other.scMenuPK != null) || (this.scMenuPK != null && !this.scMenuPK.equals(other.scMenuPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.scc.dbd.regcom.db.ScMenu[ scMenuPK=" + scMenuPK + " ]";
    }
    
}
