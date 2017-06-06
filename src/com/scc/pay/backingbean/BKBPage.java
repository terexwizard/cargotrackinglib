/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scc.pay.backingbean;

import com.scc.f1.backingbean.BKBPageImpl;
//import javax.faces.context.FacesContext;
//import com.scc.rd.newonlinedoc.backingbean.BKBUserData;

/**
 *
 * @author xtra
 * @version 1.00.00
 * 25/07/2555  11:32:34
 */
public abstract class BKBPage extends BKBPageImpl {

    public BKBPage() {
        
        
    }
    
    
    @Override
    public BKBUserData getUser(){
        
        return (BKBUserData)super.getUser();
    }

//    @Override
//    protected void redirectPage(String url) {
////        super.redirectPage(url); //To change body of generated methods, choose Tools | Templates.
//        
//        logger.debug("to :"+url);
//        
//        FacesContext context = FacesContext.getCurrentInstance();
//        context.getApplication().getNavigationHandler().handleNavigation(context, null, url+"?faces-redirect=true");
//        
//        afterRedirectPage();
//        
//    }
 
    
    
    
}
