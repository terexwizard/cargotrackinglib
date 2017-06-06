
package com.scc.app.business;

import com.scc.app.db.ScProcLog;
import com.scc.app.db.ScProcLogPK;
import com.scc.f1.appsec.menu.BKBMenu;
import com.scc.f1.business.BusinessImpl;
import com.scc.f1.util.Utils;



/**
 *
 * @author xtra
 * @version 1.00.00
 * 24/10/2555 19:05:57
 */
public class BzActionLog extends BusinessImpl{

    @Override
    protected Object doProcess(Object inobj) {
        
        BKBMenu frmi   = (BKBMenu) inobj;
        
        logger.debug("update :" +frmi.isUpdatelog() +", "+ frmi.getCurmenucode() +"/"+frmi.getUserid() );
        
        if(frmi.isUpdatelog()){
            
            ScProcLog   rec      = em.find(ScProcLog.class, new ScProcLogPK(frmi.getCurmenudate(),  frmi.getCurmenuseq() , frmi.getCurmenuseqrand()));
            
            if(rec != null){
                
                rec.setProcTimeout(Utils.getcurDateTime());
                rec.setTupdlcnt(addLcnt(rec.getTupdlcnt()));
                rec.setTupdtime(Utils.getcurDateTime());
                rec.setTupduser(frmi.getUserid());
                
                merge(rec);
                
            }
            
        }else{
            
            
            ScProcLog   rec     = new ScProcLog(frmi.getCurmenudate(),  frmi.getCurmenuseq() , frmi.getCurmenuseqrand() );
            
            rec.setProcUserCode( frmi.getUserid() );
            
//            rec.setProcUserOffcode(frmi.getUser().getUseroffcode());
//            rec.setProcCmoffCode( frmi.getUser().getUseroffcode() );
//            rec.setProcCmoffJcode( frmi.getUser().getUserprovincecode() );
            
            rec.setProcFuncCode( frmi.getCurmenucode() );
            rec.setProcIpaddr( frmi.getCurmenuipadr() );
            rec.setProcTimein( Utils.getcurDateTime() );
            
            rec.setTentuser(frmi.getUserid());
            rec.setTenttime(Utils.getcurDateTime());
            rec.setTupdlcnt(1);
            rec.setTupdtime( Utils.getcurDateTime() );
            rec.setTupduser(frmi.getUserid());

            String ssi  = frmi.getSessioninfo();
            if(ssi == null || ssi.equals("")){
                
            }else{
                if(ssi.length() > 300)  ssi = ssi.substring(0,300);
                
                rec.setSessionInfo(ssi);
            }
            
            //>>terex Comment 19/01/2556
            persist(rec);
        }
        
        
        
        
        
        return inobj;
    }

}
