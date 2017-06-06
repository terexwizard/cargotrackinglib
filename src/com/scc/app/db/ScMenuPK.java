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
public class ScMenuPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "MENU_TEMPL")
    private String menuTempl;
    @Basic(optional = false)
    @Column(name = "MENU_CODE")
    private String menuCode;

    public ScMenuPK() {
    }

    public ScMenuPK(String menuTempl, String menuCode) {
        this.menuTempl = menuTempl;
        this.menuCode = menuCode;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (menuTempl != null ? menuTempl.hashCode() : 0);
        hash += (menuCode != null ? menuCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScMenuPK)) {
            return false;
        }
        ScMenuPK other = (ScMenuPK) object;
        if ((this.menuTempl == null && other.menuTempl != null) || (this.menuTempl != null && !this.menuTempl.equals(other.menuTempl))) {
            return false;
        }
        if ((this.menuCode == null && other.menuCode != null) || (this.menuCode != null && !this.menuCode.equals(other.menuCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.scc.dbd.regcom.db.ScMenuPK[ menuTempl=" + menuTempl + ", menuCode=" + menuCode + " ]";
    }
    
}
