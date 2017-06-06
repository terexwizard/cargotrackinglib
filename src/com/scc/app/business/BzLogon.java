/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scc.app.business;

import com.scc.f1.Constant;
import com.scc.f1.business.BusinessImpl;
import com.scc.f1.util.BeanUtil;
import com.scc.f1.util.MessageUtil;
import com.scc.f1.util.SecurityUtil;
import com.scc.f1.util.Utils;
import com.scc.pay.backingbean.BKBUserData;
import com.scc.pay.backingbean.UserInfo;
//import com.scc.nstda.rdconline.bkbean.BKBLogin;
//import com.scc.nstda.rdconline.db.Rg95RoletypeRef;
import com.scc.app.db.ScConfig;
import com.scc.app.db.ScUser;
import com.scc.app.db.ScUserCertificate;
import com.scc.app.db.ScUserCertificatePK;
import com.scc.app.db.ScUserInfo;
import com.scc.app.db.ScUserLogonLock;
import com.scc.app.db.ScUserLogonLockPK;
import com.scc.app.db.ScUserSession;
import com.scc.f1.appsec.menu.BKBLoginSA;
//import com.scc.nstda.rdconline.db.TbProvince;
//import com.scc.nstda.rdconline.db.TbProvincePK;
import java.util.HashMap;
import java.util.List;
import javax.persistence.Query;
import javax.servlet.http.HttpSession;

/**
 *
 * @author xtra
 * @version 1.00.00
 * 26/07/2555  21:17:49
 */
public class BzLogon extends BusinessImpl{
    
    @Override
    protected Object doProcess(Object inobj) {
        
        HashMap<String, Object> logondata   = (HashMap<String, Object>) inobj;
            
        String uiuid        = (String)logondata.get("uiuserid");
        String uiupwd       = (String)logondata.get("uiuserpassword");
        
        ScUser  scuser  = em.find(ScUser.class,uiuid);
                
        if(scuser == null){
            createBusinessException(MessageUtil.BUSINESS_ERROR_LOGON_USER_PASSWORD_INCERRECT_051);
        }else{
            
            
            if(!verifyUserLock(uiuid)){
                
                logondata.put(BKBLoginSA.KEY_USER_LOCK , true);
                
            }else{
            
                if(verifyPassword(scuser.getUserPasswd(), uiupwd, uiuid, logondata) ){

                    if(scuser.getUserActive() == null || !scuser.getUserActive().equals("Y")){
                        createBusinessException(MessageUtil.BUSINESS_ERROR_LOGON_USER_PASSWORD_INCERRECT_051);

                    }else{

                        if( !checkSession(logondata) ){

    //                        createBusinessException(MessageUtil.BUSINESS_ERROR_LOGONSESSION_102);

                        }else{


                            BKBUserData bku    = (BKBUserData)logondata.get("user");

                            bku.setUserid(uiuid);

                            bku.setUsertitlecode( scuser.getUserTitle());
                            bku.setUsertitle(scuser.getUserTnm());
                            bku.setUsername( scuser.getUserFnm() +" " +scuser.getUserLnm());
                            //>>terex edit 30/04/2556
                            bku.setUserfirstname(scuser.getUserFnm());
                            bku.setUserlastname(scuser.getUserLnm());

                            bku.setUserpin( scuser.getUserPin());
        //                    bku.setUseroffcode( scuser.getUserCmoffCode());
        //                    bku.setUserprovincecode( scuser.getUserCmoffJcode());

        //                    bku.setUsertype( scuser.getUserType());
        //                    bku.setUserfgpriv( scuser.getUserFgpriv());
        //                    bku.setUserpriviledge( scuser.getUserPriviledge());
                            bku.setUseractive( scuser.getUserActive());

                            bku.setUserpvname("");


                            ScUserInfo dbui     = em.find(ScUserInfo.class, bku.getUserid());
                            UserInfo userinfo   = new UserInfo();

                            if(dbui == null){

                            }else{

                                BeanUtil.copyProperties(userinfo, dbui);

                            }

                            //terex 16/8/2558
//                            ScUserCertificate uc    = em.find(ScUserCertificate.class, new ScUserCertificatePK(bku.getUserid(), 1) );
//
//                            if(uc == null){
//
//                            }else{
//                                userinfo.setUsercn( Utils.NVL(uc.getCertUsercn()) );
//
//                                userinfo.setUsercertcn(Utils.NVL(uc.getCertUsercn()) );
//                                userinfo.setUsercertthumbprint(Utils.NVL(uc.getCertThumbprint()) );
//                            }

                            bku.setUserproperties(userinfo);

                            //=========================

                            String regroletype  = Utils.NVL(userinfo.getRegRoletype());

                            if(!regroletype.equals("")){

//                                Rg95RoletypeRef rg95    = em.find(Rg95RoletypeRef.class, regroletype);
//
//                                if(rg95 != null){
//                                    userinfo.setRegRoletypeName(rg95.getUsertypeRoleDesc());
//                                }


                            }
                            //=========================

        //                    String pvcd   = scuser.getUserCmoffJcode();
        //                    if(pvcd != null && !pvcd.equals("")){
        //                       
        //                        TbProvince tbpv     = findProvince(pvcd, "00", "00");
        //                        if(tbpv != null){
        //                            bku.setUserpvname( tbpv.getPvNameth());
        //                        }
        //                        
        //                    }
        //                    
        //                    bku.setOffice(new BKBOfficeb());
        //                    
        //                    String offcd  = scuser.getUserCmoffCode();
        //                    if(offcd != null && !offcd.equals("")){
        //                       
        //                        TbCmoffice tboff     = em.find(TbCmoffice.class, offcd);
        //                        
        //                        if(tboff != null){
        //                            bku.getOffice().setOffcode(tboff.getCmoffCode()); 
        //                            bku.getOffice().setOffjcode(tboff.getCmoffJcode()); 
        //                            bku.getOffice().setOffacode(tboff.getCmoffAcode()); 
        //                            bku.getOffice().setOffno(tboff.getCmoffNo()); 
        //                            
        //                            bku.getOffice().setOffnameth(tboff.getCmoffNameth()); 
        //                            bku.getOffice().setOffnameen(tboff.getCmoffNameen()); 
        //                            bku.getOffice().setOfftype(tboff.getCmoffType()); 
        //                            bku.getOffice().setOffactive(tboff.getCmoffAcode());
        //                            
        //                            TbProvince tbpv     = findProvince(tboff.getCmoffJcode(), "00", "00");
        //                            if(tbpv != null){
        //                                bku.getOffice().setOffpvname(tbpv.getPvNameth());
        //                            }
        //                            
        //                            tbpv     = findProvince(tboff.getCmoffJcode(), tboff.getCmoffAcode(), "00");
        //                            if(tbpv != null){
        //                                bku.getOffice().setOffapname(tbpv.getPvNameth());
        //                            }
        //                            
        //                        }
        //                        
        //                    }


                            //TO DO clear lock 
                            clearUserLock(uiuid);

                         }
                    }

                }else{
                    createBusinessException(MessageUtil.BUSINESS_ERROR_LOGON_USER_PASSWORD_INCERRECT_051);

                }
                
            }   // validate lock
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
//    
    private boolean verifyPassword(String dbpwd, String uipwd, String usercode, HashMap<String, Object> logondata ){
        boolean isok    ;
        
//        logger.debug(">>> " + SecurityUtil.encryptPasswordString(uipwd) );
        logger.debug(">>> db " + dbpwd );
        logger.debug(">>> ui " + SecurityUtil.encryptPasswordBase64(uipwd) );
        
        //TO DO decrypt / verify password
        
        //TODO should use salt hash verify
        
        isok    =  SecurityUtil.verifyPasswordBase64withPain( dbpwd, uipwd);
        
        
//        if(dbpwd==null) dbpwd   = "";
//        if(uipwd==null) uipwd   = "";
//        
//        if(dbpwd.equals(uipwd)){
//            isok    = true;
//        }
        
        //TO DO insert user lock
        if( !isok ){

            int cnt = queryCfg();
            
            if(cnt > 0){
                
                HttpSession session = (HttpSession)logondata.get("usersession");

                String ssid         = session.getId();
                String ssip         = (String)logondata.get("sessionip");
                String ssag         = (String)logondata.get("sessionagent");
                String ssinfo       = ssid + " ,agent :" +ssag;
                if(ssinfo.length()>300)  ssinfo = ssinfo.substring(0, 300);

                String sinfo    = Constant.server_name +" , "+ Constant.server_ip;
                if(sinfo.length()>100) sinfo    = sinfo.substring(0,100);

                ScUserLogonLock ul  = new ScUserLogonLock(new ScUserLogonLockPK(usercode, Utils.createKeyRandomInt()) );

                ul.setLogonTime(Utils.getcurDateTime());
                ul.setLogonLimit(cnt);
                ul.setLockStatus("A");
                ul.setSessionClientip(ssip);
                ul.setSessionInfo(ssinfo);
                ul.setServerInfo( sinfo );

                ul.setTentuser(usercode);
                ul.setTenttime(Utils.getcurDateTime());
                ul.setTupdlcnt(1);
                ul.setTupdtime( Utils.getcurDateTime() );
                ul.setTupduser(usercode);

                persist(ul);

                transactionCommit();
            
            }
            
        }
        
        
        return isok;
    }
    
        
    private boolean checkSession(HashMap<String, Object> logondata){
        
        boolean isok    = false;
        
        String uiuid        = (String)logondata.get("uiuserid");
        HttpSession session = (HttpSession)logondata.get("usersession");
        String ssid         = session.getId();

        List<ScUserSession> qresult;
            
        Query query ;
            
        logger.debug("user :" + uiuid+" / " +ssid);
        
        //check same session 
        query = em.createNamedQuery("ScUserSession.findByUserSession");
        query.setParameter("userSession", ssid);
        
        qresult = query.getResultList();
        
        if(qresult == null || qresult.isEmpty()){
            
        }else{
            
            createBusinessException(MessageUtil.BUSINESS_ERROR_LOGON_SESSIONID_DUP_053);
            
            return false;
        }
            
        
        if(Constant.SECURITY_SESSION_ISSINGLE){
            
            query = em.createNamedQuery("ScUserSession.findByUserCode");
            query.setParameter("userCode", uiuid);
            
            qresult = query.getResultList();
        
            if(qresult == null || qresult.isEmpty()){
                isok    = true;
            }else{
                
                createBusinessException(MessageUtil.BUSINESS_ERROR_LOGON_USER_DUP_052);
                
            }
            
            
        }else{
            isok    = true;
        }
        
        return isok;
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
//        List<ScConfig> cfglist;
//        
//        Query query = em.createNamedQuery("ScConfig.findByCfgcode");
//        query.setParameter("cfgcode", "LOGON_INVALID_PASSWORD_ATTEMPT");
//        
//        cfglist = query.getResultList();
//        
//        if(cfglist == null || cfglist.isEmpty()){
////            cnt     = 3;
//        }else{
//            cnt     = Utils.toInt(cfglist.get(0).getCfgrvalue());
//            
//            if(cnt==0){
//                cnt = 3;
//            }
//        }
        
        //===============================
        
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
    
    private boolean clearUserLock(String usercode){
        
        boolean isok    = false;
        
        //===============================
        
        List<ScUserLogonLock> locklist;
        
        Query   query         = em.createNamedQuery("ScUserLogonLock.findByActiveUserCode");
        query.setParameter("userCode", usercode);
        
        locklist = query.getResultList();
        
        if(locklist == null ){
            // some error
        }else{
            
            for(ScUserLogonLock ul :locklist ){
                
                ul.setLockStatus("D");
                ul.setTupdlcnt( addLcnt( ul.getTupdlcnt()));
                ul.setTupdtime( Utils.getcurDateTime() );
                ul.setTupduser( usercode);
                
                merge(ul);
            }
            
            isok    = true;
            
        }
        
        return isok;
    }
    
}
