
package com.scc.pay.backingbean;

import com.scc.f1.backingbean.BKBUser;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



/**
 *
 * @author xtra
 * @version 1.00.00
 * 26/01/2556 21:40:13
 */

@ManagedBean(name="bKBUser")
@SessionScoped
public class BKBUserData extends BKBUser {

    public BKBUserData() {
        
        
    }
    
    
    @Override
    public UserInfo getUserproperties(){
        
        if(super.getUserproperties() == null){
            UserInfo    uinfo   = new UserInfo();
            super.setUserproperties(uinfo);
            return uinfo;
        }else{
            return (UserInfo)super.getUserproperties();
        }
        
    }
    

    public void setUserproperties(UserInfo info){
        
        super.setUserproperties(info);
        
    }
    

}
