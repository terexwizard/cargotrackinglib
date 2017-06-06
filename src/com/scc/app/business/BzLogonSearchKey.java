/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.scc.app.business;

import com.scc.f1.business.BusinessImpl;
import com.scc.f1.util.MessageUtil;
import com.scc.f1.util.Utils;
//import com.scc.nstda.rdconline.bkbean.BKBLogin;
import com.scc.app.db.ScConfig;
import com.scc.app.db.ScUser;
import com.scc.app.db.ScUserCertificate;
import com.scc.app.db.ScUserCertificatePK;
import com.scc.app.db.ScUserLogonLock;
import com.scc.f1.appsec.menu.BKBLoginSA;
import java.util.HashMap;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author xtra
 * @version 1.00.00
 * 02/07/2556  23:23:33
 */
public class BzLogonSearchKey extends BusinessImpl{

    @Override
    protected Object doProcess(Object inobj) {
        
        HashMap<String, Object> logondata   = (HashMap<String, Object>) inobj;
            
        String uiuserid         = (String)logondata.get("uiuserid");
        String ou               = "";
        String thp              = "";
        
        if(!verifyUserLock(uiuserid)){
                
            logondata.put(BKBLoginSA.KEY_USER_LOCK , true);

        }else{
        
            ScUserCertificate  rec         = em.find(ScUserCertificate.class, new ScUserCertificatePK(uiuserid, 1) );

            if(rec != null){

                ou      = Utils.NVL(rec.getCertUsercn());
                thp      = Utils.NVL(rec.getCertThumbprint());
            }

            logondata.put("ckey", ou);
            logondata.put("tpkey", thp);
        
        }
        
        
        return inobj;
    
    }
       
    
    private int queryCfg(){
        
        int cnt         = 0;
        List<ScConfig> cfglist;

        Query query = em.createNamedQuery("ScConfig.findByCfgcode");
        query.setParameter("cfgcode", "LOGON_INVALID_PASSWORD_ATTEMPT");

        cfglist = query.getResultList();

        if(cfglist == null || cfglist.isEmpty()){
//            cnt     = 3;
        }else{
            cnt     = Utils.toInt(cfglist.get(0).getCfgrvalue());

//            if(cnt==0){
//                cnt = 3;
//            }
        }

        return cnt;
        
    }
    
    private boolean verifyUserLock(String usercode){
        
        boolean isok    = false;
        
        int cnt         = queryCfg();

        
        if(cnt <= 0){
            isok    = true;
        }else{
            List<ScUserLogonLock> locklist;

            Query query         = em.createNamedQuery("ScUserLogonLock.findByActiveUserCode");
            query.setParameter("userCode", usercode);

            locklist = query.getResultList();

            if(locklist == null ){
                // some error
            }else{

                if(locklist.size()>=cnt){

                }else{
                    isok    = true;
                }
            }
        }
        
        if(!isok){
            
            createBusinessException(MessageUtil.BUSINESS_ERROR_LOGON_INVALID_PASSWORD_LOCK_054);
            
        }
        
        
        
        return isok;
    }
    

}
