/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scc.app.db;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author xtra
 * @version 1.00.00
 * 26/07/2555  21:43:41
 */
@Embeddable
public class ScMenuDispPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "MENU_TEMPL")
    private String menuTempl;
    @Basic(optional = false)
    @Column(name = "MENU_CODE")
    private String menuCode;
    @Basic(optional = false)
    @Column(name = "MENU_DISP_CODE")
    private String menuDispCode;

    public ScMenuDispPK() {
    }

    public ScMenuDispPK(String menuTempl, String menuCode, String menuDispCode) {
        this.menuTempl = menuTempl;
        this.menuCode = menuCode;
        this.menuDispCode = menuDispCode;
    }

    public String getMenuTempl() {
        return menuTempl;
    }

    public void setMenuTempl(String menuTempl) {
        this.menuTempl = menuTempl;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public String getMenuDispCode() {
        return menuDispCode;
    }

    public void setMenuDispCode(String menuDispCode) {
        this.menuDispCode = menuDispCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (menuTempl != null ? menuTempl.hashCode() : 0);
        hash += (menuCode != null ? menuCode.hashCode() : 0);
        hash += (menuDispCode != null ? menuDispCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScMenuDispPK)) {
            return false;
        }
        ScMenuDispPK other = (ScMenuDispPK) object;
        if ((this.menuTempl == null && other.menuTempl != null) || (this.menuTempl != null && !this.menuTempl.equals(other.menuTempl))) {
            return false;
        }
        if ((this.menuCode == null && other.menuCode != null) || (this.menuCode != null && !this.menuCode.equals(other.menuCode))) {
            return false;
        }
        if ((this.menuDispCode == null && other.menuDispCode != null) || (this.menuDispCode != null && !this.menuDispCode.equals(other.menuDispCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.scc.dbd.regcom.db.ScMenuDispPK[ menuTempl=" + menuTempl + ", menuCode=" + menuCode + ", menuDispCode=" + menuDispCode + " ]";
    }
    
}
