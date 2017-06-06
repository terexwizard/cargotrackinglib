
package com.scc.app.business;

import com.scc.f1.business.BusinessImpl;
import com.scc.app.db.ScUserSession;
//import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.persistence.Query;
import javax.servlet.http.HttpSession;



/**
 *
 * @author xtra
 * @version 1.00.00
 * 17/05/2556 12:39:35
 */
public class BzLogoutSession extends BusinessImpl{

    @Override
    protected Object doProcess(Object inobj) {
        
        HashMap<String, Object> logondata   = (HashMap<String, Object>) inobj;
            
//        String uiuid        = (String)logondata.get("uiuserid");
        
        HttpSession session = (HttpSession)logondata.get("usersession");
        
        String ssid         = session.getId();
        
        
        List<ScUserSession> qresult ;
        
        String sql      = "Select o from ScUserSession o "+
                            "Where o.scUserSessionPK.userSession = '" + ssid +"' ";
        
        
        Query query = em.createQuery(sql);
        //query.setLockMode(LockModeType.PESSIMISTIC_WRITE);

        qresult = query.getResultList();
        
        
        
        for(ScUserSession r: qresult){
            
            remove(r);
            
        }
        
        logger.debug("remove session record "+ssid);
        
        return inobj;
    }

}
