
package com.scc.app.business;

import com.scc.f1.Constant;
import com.scc.f1.business.BusinessImpl;
import com.scc.f1.util.Utils;
import com.scc.app.db.ScUserSession;
import com.scc.app.db.ScUserSessionPK;
import java.util.HashMap;
import javax.servlet.http.HttpSession;



/**
 *
 * @author xtra
 * @version 1.00.00
 * 28/05/2556 14:29:08
 */
public class BzLoginSession extends BusinessImpl{

    @Override
    protected Object doProcess(Object inobj) {
        
        HashMap<String, Object> logondata   = (HashMap<String, Object>) inobj;
        
        String uiuid        = (String)logondata.get("uiuserid");
        
        HttpSession session = (HttpSession)logondata.get("usersession");
        
        String ssid         = session.getId();
        
        String ssip         = (String)logondata.get("sessionip");
        String ssag         = (String)logondata.get("sessionagent");
        
        if(ssag.length()>300)  ssag = ssag.substring(0, 300);
        
        //ScUserSession sus   = em.find(ScUserSession.class, uiuid);
        
        ScUserSession sus   = em.find(ScUserSession.class, new ScUserSessionPK(uiuid, ssid));
            
        if(sus==null){
        
            sus     = new ScUserSession(new ScUserSessionPK(uiuid, ssid));

//            sus.setUserCode(uiuid);
//            sus.setUserSession(session.getId());

            sus.setSessionLogontime(Utils.getcurDateTime());
            sus.setSessionLasttime(Utils.getcurDateTime());

            sus.setSessionClientip(ssip);
            sus.setSessionInfo(ssag);
            
            sus.setSessionStatus("A");
//                sus.setSessionInfo();

            String sinfo    = Constant.server_name +" , "+ Constant.server_ip;
            if(sinfo.length()>100) sinfo    = sinfo.substring(0,100);
            sus.setServerInfo( sinfo );

            sus.setTentuser(uiuid);
            sus.setTenttime(Utils.getcurDateTime());
            sus.setTupdlcnt(1);
            sus.setTupdtime( Utils.getcurDateTime() );
            sus.setTupduser(uiuid);

            persist(sus);
            
            logger.debug("insert session record :"+ssid);
        
        }else{
            
            sus.setSessionLogontime(Utils.getcurDateTime());
            sus.setSessionLasttime(Utils.getcurDateTime());

            sus.setSessionClientip(ssip);
            sus.setSessionInfo(ssag);
            
            sus.setSessionStatus("U");
            
            sus.setTupdtime( Utils.getcurDateTime() );
            sus.setTupduser(uiuid);
            
            merge(sus);
            
            logger.debug("update session record :"+ssid);
        }
        
        
        
        
        return inobj;
    }

}
