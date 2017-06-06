/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.eclipse.persistence.logging;

import org.apache.log4j.Logger;
import org.eclipse.persistence.config.SessionCustomizer;
import org.eclipse.persistence.sessions.Session;

/**
 *
 * @author xtra
 * @version 1.00.00
 * 10/09/2556  20:49:03
 */
public class JPAEclipseLinkSessionCustomizer implements SessionCustomizer {

    private static final Logger logger = Logger.getLogger(JPAEclipseLinkSessionCustomizer.class);
    
    @Override
    public void customize(Session sn) throws Exception {

        logger.info("custom : v 1.02 "+sn.getLogLevel());
//        logger.info("custom :"+sn.getLogLevel() +" "+sn.getDatasourcePlatform());
//        logger.info("custom :"+sn.getSessionLog());
                
        // create a custom logger
        SessionLog aCustomLogger = (SessionLog) new EPSCLog();
        aCustomLogger.setLevel(sn.getLogLevel()); // Logging level finest
        sn.setSessionLog(aCustomLogger);

//        DefaultSessionLog dsl   = (DefaultSessionLog)sn.getSessionLog();
//        
//        sn.getDatasourceLogin().setUserName("");
//        sn.getDatasourceLogin().setPassword("");
        
    }

}
