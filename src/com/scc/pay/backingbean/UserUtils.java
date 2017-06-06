
package com.scc.pay.backingbean;



/**
 *
 * @author xtra
 * @version 1.00.00
 * 14/02/2556 21:44:16
 */
public class UserUtils {

    public static String getUserID(BKBPage p){
        return p.getUserid();
    }
    
    public static String getUserOffcode(BKBPage p){
        
        return p.getUser().getUserproperties().getUserOffcode();
    }
    
    
    public static String getUserID(BKBUserData u){
        return u.getUserid();
    }
    
    public static String getUserOffcode(BKBUserData u){
        return u.getUserproperties().getUserOffcode();
    }
    
}
