
package com.scc.pay.backingbean;

//import com.scc.rd.newonlinedoc.AppConstant;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;



/**
 *
 * @author xtra
 * @version 1.00.00
 * 20/02/2556 12:13:00
 */

@ManagedBean
@ApplicationScoped
public class BKBLibVar {
    
    
    public static final String  COMPO_DOCX_SIGN     = "/app/inc/docxsign.xhtml";
    public static final String  COMPO_DOCX_SIGN13     = "/app/inc/docxsign13.xhtml";
    public static final String  COMPO_DOCX_DOCSIGNER     = "/app/inc/docxdocsigner.xhtml";
    
    public static final String  COMPO_VERIFY_RESULT_ICON            = "/app/inc/verifyresult.xhtml";
    public static final String  COMPO_CERTIFYCAT_VIEW_BUTTON        = "/app/inc/certview.xhtml";
//    public String PART_IMAGE                          = AppConstant.PART_IMAGE;
    
    public static final String  COMPO_CERTIFYCAT_LIST               = "/app/inc/certlist.xhtml";
    public static final String  COMPO_CERTIFYCAT_LIST13             = "/app/inc/certlist13.xhtml";
    
    public static final String  COMPO_DOWNLOAD                      = "/app/inc/dl.xhtml";
    public static final String  COMPO_UPLOAD_PICTURE                = "/app/inc/uploadpicture.xhtml";
    public static final String  COMPO_UPLOAD_FILE                   = "/app/inc/uploadfile.xhtml";
    
    public static final String  SIGNATURE_DATA_KEYNAME              = "requestdata";
    
    public static final String  TEXT_CONCAT_DELIMITER_COLUMN        = "#F#";
    public static final String  TEXT_CONCAT_DELIMITER_ROW           = "#R#";
    
    public String getCOMPO_DOCX_SIGN() {
        return COMPO_DOCX_SIGN;
    }

    public String getCOMPO_VERIFY_RESULT_ICON() {
        return COMPO_VERIFY_RESULT_ICON;
    }

    public String getCOMPO_CERTIFYCAT_VIEW_BUTTON() {
        return COMPO_CERTIFYCAT_VIEW_BUTTON;
    }
    
    public String getCOMPO_CERTIFYCAT_LIST() {
        return COMPO_CERTIFYCAT_LIST;
    }
    
    
    
//    public String getPART_IMAGE() {
//        
//        System.out.println(">>PART_IMAGE "+PART_IMAGE);
//        
//        return PART_IMAGE;
//    }

    public String getCOMPO_DOWNLOAD() {
        return COMPO_DOWNLOAD;
    }

    public String getSIGNATURE_DATA_KEYNAME() {
        return SIGNATURE_DATA_KEYNAME;
    }

    public String getTEXT_CONCAT_DELIMITER_COLUMN() {
        return TEXT_CONCAT_DELIMITER_COLUMN;
    }

    public String getTEXT_CONCAT_DELIMITER_ROW() {
        return TEXT_CONCAT_DELIMITER_ROW;
    }

    public String getCOMPO_UPLOAD_PICTURE() {
        return COMPO_UPLOAD_PICTURE;
    }

    public String getCOMPO_UPLOAD_FILE() {
        return COMPO_UPLOAD_FILE;
    }

    public String getCOMPO_DOCX_SIGN13() {
        return COMPO_DOCX_SIGN13;
    }

    public String getCOMPO_CERTIFYCAT_LIST13() {
        return COMPO_CERTIFYCAT_LIST13;
    }

    public String getCOMPO_DOCX_DOCSIGNER() {
        return COMPO_DOCX_DOCSIGNER;
    }
    
    

}
