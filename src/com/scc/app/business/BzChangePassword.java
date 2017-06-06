/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scc.app.business;

import com.scc.f1.business.BusinessImpl;
import com.scc.f1.util.MessageUtil;
import com.scc.f1.util.SecurityUtil;
import com.scc.f1.util.Utils;
//import com.scc.nstda.rdconline.bkbean.BKBLogin;
import com.scc.app.db.ScUser;
import com.scc.f1.appsec.menu.BKBLoginSA;
//import com.scc.nstda.rdconline.db.TbProvince;
//import com.scc.nstda.rdconline.db.TbProvincePK;

/**
 *
 * @author xtra
 * @version 1.00.00
 * 26/07/2555  21:17:49
 */
public class BzChangePassword extends BusinessImpl{

    @Override
    protected Object doProcess(Object inobj) {
        
        
        BKBLoginSA frmi   = (BKBLoginSA) inobj;
        
                   
        String uiuid        = frmi.getUicuserid();
        String uiupwd       = frmi.getUicuserpassword1();
        
        ScUser  scuser  = em.find(ScUser.class,uiuid);
                
        if(scuser == null){
            createBusinessException(MessageUtil.BUSINESS_ERROR_LOGON_USER_PASSWORD_INCERRECT_051);
        }else{
            
            if(verifyPassword(scuser.getUserPasswd(), uiupwd) ){
                
//                scuser.setUserPasswd( frmi.getUicuserpassword2() );
                scuser.setUserPasswd( SecurityUtil.encryptPasswordBase64(frmi.getUicuserpassword2()) );
                
                scuser.setTupdlcnt( addLcnt( scuser.getTupdlcnt()));
                scuser.setTupdtime( Utils.getcurDateTime() );
                scuser.setTupduser( frmi.getUicuserid());
                
                merge(scuser);
            
            }else{
                createBusinessException(MessageUtil.BUSINESS_ERROR_LOGON_USER_PASSWORD_INCERRECT_051);
            }
        }
                
        return inobj;
    }
    
//    private TbProvince findProvince(String pvcd, String apcd, String tbcd){
//        
////        boolean isok    = false;
//        
//        return em.find(TbProvince.class, new TbProvincePK(pvcd, apcd, tbcd));
//        
//    }
    
    private boolean verifyPassword(String dbpwd, String uipwd){
        boolean isok    ;
        
        
        logger.debug(">>> db " + dbpwd );
        logger.debug(">>> ui " + SecurityUtil.encryptPasswordBase64(uipwd) );
        
        //TO DO decrypt / verify password
        
        isok    =  SecurityUtil.verifyPasswordBase64withPain( dbpwd, uipwd);
        
//        if(dbpwd==null) dbpwd   = "";
//        if(uipwd==null) uipwd   = "";
//        
//        if(dbpwd.equals(uipwd)){
//            isok    = true;
//        }
        
        
        return isok;
    }
    
}
