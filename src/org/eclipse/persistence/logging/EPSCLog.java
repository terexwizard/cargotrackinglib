/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.eclipse.persistence.logging;

//import java.util.logging.Level;
import org.apache.log4j.Logger;

/**
 * Ecliplink Persistance Session Custom Log
 * @author xtra
 * @version 1.00.00
 * 10/09/2556  20:47:57
 */
public class EPSCLog extends AbstractSessionLog implements SessionLog {

    private static final Logger logger = Logger.getLogger(EPSCLog.class);
    
    @Override
    public void log(SessionLogEntry sle) {
        
            //        System.out.println("CUSTOM: v 1.02 "+sle.getLevel()+" ,"+sle.getDate() +" ,"+sle.getSession());
            //        System.out.println("CUSTOM: "+sle.getConnection());
            //        System.out.println("CUSTOM: "+" ,"+sle.getThread() +
            //                " ,"+sle.getNameSpace() +"//"+sle.getMessage() +
            //                " ,param :"+sle.getParameters());
                  
        
                
//        String constat  = "-";
//        String sessstat = "-";
//        try {
            
                    
          String constat = ( sle.getConnection()==null ?"null" : "conn("+
                        String.valueOf(System.identityHashCode(sle.getConnection()))+")");
            
//                    constat  = ( sle.getConnection()==null ?"null" : "conn(" +"/"+ 
//                            (sle.getConnection().getConnection()==null ?"null": sle.getConnection().getConnection().isClosed()) );
//        } catch (Exception ex) {
//            java.util.logging.Logger.getLogger(EPSessionLog.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        String sessstat    = (sle.getSession()==null?"":"sess("+sle.getSession().getLogSessionString()+")");
        
        
        if(sle.getLevel() == 0 ){
            logger.trace( sessstat +constat +" ,"+
                            sle.getNameSpace() +"::"+sle.getMessage() );
        }else if(sle.getLevel() <= 3 ){
            logger.debug( sessstat +constat +" ,"+
                            sle.getNameSpace() +"::"+sle.getMessage() );
//                            (sle.getConnection()==null?"":sle.getConnection()) );
        }else if(sle.getLevel() <= 5 ){
            logger.info( sessstat +constat +" ,"+
                            sle.getNameSpace() +"::"+sle.getMessage() );
        }else if(sle.getLevel() == 6 ){
            logger.warn( sessstat +constat +" ,"+
                            sle.getNameSpace() +"::"+sle.getMessage() );
        }else if(sle.getLevel() == 7 ){
            logger.fatal( sessstat +constat +" ,"+
                            sle.getNameSpace() +"::"+sle.getMessage() );
        }else if(sle.getLevel() == 8 ){
            //logger.(session);
            
        }
        
//        logger.debug(sle.getLevel()+" ,"+sle.getDate() +" ,"+sle.getSession().getLogSessionString() +
//                " ,"+sle.getConnection().getConnection().toString() +" ,"+sle.getThread().getName() +
//                " ,"+sle.getNameSpace() +"//"+sle.getMessage() +
//                " ,param :"+sle.getParameters());
    }

}
