
package com.scc.pay.backingbean;

import com.scc.f1.backingbean.BKBListData;
import com.scc.f1.dbutil.DBUtils;
import java.util.HashMap;
import com.scc.f1.dbutil.RdbXML;

import java.util.List;
import javax.faces.model.SelectItem;
import org.apache.log4j.Logger;



/**
 *
 * @author xtra
 * @version 1.00.00
 * 21/08/2555 20:24:23
 */
public class BKBListAppData extends BKBListData {

    private static Logger logger   = Logger.getLogger(BKBListAppData.class);
        
    
    public static final String TB_RDZONE            = "TB_RDZONE";
    public static final String TB_RDZONESH          = "TB_RDZONESH";
    public static final String TB_PKICARD_SOUR      = "TB_PKICARD_SOUR";
    public static final String TB_CMOWNER_GROUP     = "TB_CMOWNER_GROUP";
    
    public static final String TB_TITLELIST         = "TB_TITLELIST";
    
    public static final String TB_PROVINCE_ONLY     = "TB_PROVINCE_ONLY";
    public static final String TB_PROVINCE_EN       = "TB_PROVINCE_ONLY";
    
    public static final String TB_AMPUR             = "TB_AMPUR";
    public static final String TB_AMPUR_EN          = "TB_AMPUR_EN";
    
    public static final String TB_TUMBON            = "TB_TUMBON";
    public static final String TB_TUMBON_EN         = "TB_TUMBON_EN";
    
    public static final String COUNTRY              = "COUNTRY";
    
    public static final String TB10_MEETING_ROOM    = "TB10_MEETING_ROOM";
    public static final String TB17_MEETING_TOPIC   = "TB17_MEETING_TOPIC";
    public static final String TB20_SIGN_NAME       = "TB20_SIGN_NAME";
    
    
//    
////    public static List<SelectItem> getSelectprovincelist(){
////        
////        if(provincelist==null){
////        
////            HashMap<String, String> pr = new HashMap<String, String>();
////
////            pr.put("only_pv", "Y");
////
////            provincelist    = DBUtils.getSelectItem("get_tb_province", pr, "pv_code", "pv_nameth", "-", null);
////        
////        }
////        
////        return provincelist;
////        
////    }
//    
////    public static Object getGeneralData(String key){
////        if(generalData==null){
////            return null;
////        }else{
////            return generalData.get(key);
////        }
////    }
////    
////    public static void putGeneralData(String key, Object data){
////        if(generalData==null){
////            generalData     = new HashMap<String, Object>();
////        }
////        
////        generalData.put(key, data);
////        
////    }
//    
    
    public static List<SelectItem> getSelectprovincelistOnly(){
        
        List<SelectItem> listitem = getListData(TB_PROVINCE_ONLY);
        
        if( getListData(TB_PROVINCE_ONLY) == null ){
        
            
            HashMap<String, String> pr = new HashMap<String, String>();

            pr.put("only_pv", "Y");

            listitem    = DBUtils.getSelectItem("get_tb_province", pr, "pv_code", "pv_nameth");
            
            putListData(TB_PROVINCE_ONLY, listitem);
            
        }
        
        return listitem;
   
        
//        if(provincelist==null){
//        
//            HashMap<String, String> pr = new HashMap<String, String>();
//
//            pr.put("only_pv", "Y");
//
////            provincelist    = DBUtils.getSelectItem("get_tb_province", pr, "pv_code", "pv_nameth", "-", null);
//            
//            provincelist    = DBUtils.getSelectItem("get_tb_province", pr, "pv_code", "pv_nameth");
//        
//        }
//        
//        return provincelist;
        
    }
    
    public static List<SelectItem> getSelectprovinceenlist(){
        
        
        List<SelectItem> listitem = getListData(TB_PROVINCE_EN);
        
        if( getListData(TB_PROVINCE_EN) == null ){
        
            
            HashMap<String, String> pr = new HashMap<String, String>();

            pr.put("only_pv", "Y");

            listitem    = DBUtils.getSelectItem("get_tb_province", pr, "pv_code", "pv_nameen");
            
            putListData(TB_PROVINCE_EN, listitem);
            
        }
        
        return listitem;
        
        
//        if(provinceenlist==null){
//        
//            HashMap<String, String> pr = new HashMap<String, String>();
//
//            pr.put("only_pv", "Y");
//
////            provincelist    = DBUtils.getSelectItem("get_tb_province", pr, "pv_code", "pv_nameth", "-", null);
//            
//            provinceenlist    = DBUtils.getSelectItem("get_tb_province", pr, "pv_code", "pv_nameen");
//        
//        }
//        
//        return provinceenlist;
        
    }
    
    public static List<SelectItem> getSelectampurlist(String pvcode){
        
        if(pvcode != null && !pvcode.equals("")){
            
            HashMap<String, List<SelectItem>> ampurlistmap = getListData(TB_AMPUR);
            
            List<SelectItem> list   = null ;
            boolean newlist         = false;
            
            if(ampurlistmap==null){
                newlist         = true;
                ampurlistmap    = new HashMap<String, List<SelectItem>>();
            }else{
            
                list   = ampurlistmap.get(pvcode);

                if(list==null){
                    newlist     = true;
                }
            }
            
            if(newlist){
               
                HashMap<String, String> pr  = new HashMap<String, String>();

                pr.put("pv_code", pvcode);
                pr.put("only_ap", "Y");

//                list   = DBUtils.getSelectItem("get_tb_province", pr, "pv_ampur", "pv_nameth", "-", null);
                list   = DBUtils.getSelectItem("get_tb_province", pr, "pv_ampur", "pv_nameth");
            
                ampurlistmap.put(pvcode, list);
                
                logger.debug(ampurlistmap.size());
            }
            
            putListData(TB_AMPUR, ampurlistmap);
            
            return list;
            
        }else{
            return RdbXML.getSelectItemBlank(null, null);
        }
    }
    
    public static List<SelectItem> getSelectampurenlist(String pvcode){
        
        if(pvcode != null && !pvcode.equals("")){
            
            HashMap<String, List<SelectItem>> ampurenlistmap = getListData(TB_AMPUR_EN);
            
            List<SelectItem> list   = null ;
            boolean newlist         = false;
            
            if(ampurenlistmap==null){
                newlist         = true;
                ampurenlistmap    = new HashMap<String, List<SelectItem>>();
            }else{
            
                list   = ampurenlistmap.get(pvcode);

                if(list==null){
                    newlist     = true;
                }
            }
            
            if(newlist){
               
                HashMap<String, String> pr  = new HashMap<String, String>();

                pr.put("pv_code", pvcode);
                pr.put("only_ap", "Y");

//                list   = DBUtils.getSelectItem("get_tb_province", pr, "pv_ampur", "pv_nameth", "-", null);
                list   = DBUtils.getSelectItem("get_tb_province", pr, "pv_ampur", "pv_nameen");
            
                ampurenlistmap.put(pvcode, list);
                
//                logger.debug(ampurenlistmap.size());
            }
            
            putListData(TB_AMPUR_EN, ampurenlistmap);
            
            return list;
            
        }else{
            return RdbXML.getSelectItemBlank(null, null);
        }
    }
    
    
    public static List<SelectItem> getSelecttumbonlist(String pvcode, String apcode){
        
        if(pvcode != null && !pvcode.equals("") && apcode != null && !apcode.equals("") ){
            
            HashMap<String, List<SelectItem>> tumbonlistmap = getListData(TB_TUMBON);
            
            List<SelectItem> list   = null ;
            boolean newlist         = false;
            
            if(tumbonlistmap==null){
                newlist         = true;
                tumbonlistmap    = new HashMap<String, List<SelectItem>>();
            }else{
            
                list   = tumbonlistmap.get(pvcode+apcode);

                if(list==null){
                    newlist     = true;
                }
            }
            
            if(newlist){
            
                HashMap<String, String> pr = new HashMap<String, String>();

                pr.put("pv_code", pvcode);
                pr.put("pv_ampur", apcode);
                pr.put("only_tb", "Y");

//                list    = DBUtils.getSelectItem("get_tb_province", pr, "pv_tumbon", "pv_nameth", "-", null);
                list    = DBUtils.getSelectItem("get_tb_province", pr, "pv_tumbon", "pv_nameth");
            
                tumbonlistmap.put(pvcode+apcode, list);
            }
            
//            logger.debug(tumbonlistmap.size());
            putListData(TB_TUMBON, tumbonlistmap);
            
            return list;
        }else{
            return RdbXML.getSelectItemBlank(null, null);
        }
    }
    
    public static List<SelectItem> getSelecttumbonenlist(String pvcode, String apcode){
        
        if(pvcode != null && !pvcode.equals("") && apcode != null && !apcode.equals("") ){
            
            HashMap<String, List<SelectItem>> tumbonenlistmap = getListData(TB_TUMBON_EN);
            
            List<SelectItem> list   = null ;
            boolean newlist         = false;
            
            if(tumbonenlistmap==null){
                newlist         = true;
                tumbonenlistmap    = new HashMap<String, List<SelectItem>>();
            }else{
            
                list   = tumbonenlistmap.get(pvcode+apcode);

                if(list==null){
                    newlist     = true;
                }
            }
            
            if(newlist){
            
                HashMap<String, String> pr = new HashMap<String, String>();

                pr.put("pv_code", pvcode);
                pr.put("pv_ampur", apcode);
                pr.put("only_tb", "Y");

//                list    = DBUtils.getSelectItem("get_tb_province", pr, "pv_tumbon", "pv_nameth", "-", null);
                list    = DBUtils.getSelectItem("get_tb_province", pr, "pv_tumbon", "pv_nameen");
            
                tumbonenlistmap.put(pvcode+apcode, list);
                
//                logger.debug(tumbonenlistmap.size());
            }
            
            putListData(TB_TUMBON_EN, tumbonenlistmap);
            
            return list;
        }else{
            return RdbXML.getSelectItemBlank(null, null);
        }
    }
    
    
    public static List<SelectItem> getSelectcountrylist(){
        
        List<SelectItem> listitem = getListData(COUNTRY);
        
        if( getListData(COUNTRY) == null ){
        
            
            listitem    = DBUtils.getSelectItem("lookup_tb_nationality", "nation_code", "country_nameth");
            
            putListData(COUNTRY, listitem);
            
        }
        
        return listitem;
        
//        if(countrylist==null){
//            HashMap<String, String> pr = new HashMap<String, String>();
//
////            countrylist     = DBUtils.getSelectItem("lookup_tb_nationality", pr, "nation_code", "country_nameth", "-", null);
//            countrylist     = DBUtils.getSelectItem("lookup_tb_nationality", pr, "nation_code", "country_nameth");
//        
//        }
//        
//        return countrylist;
        
        
    }
    
////    private static List<SelectItem> website_businesslist ;
////    private static List<SelectItem> website_typelist;
////    private static List<SelectItem> website_rulelist;
////    private static List<SelectItem> website_orderlist;
////    private static List<SelectItem> website_paymentlist;
////    private static List<SelectItem> website_deliverylist;
//
//    public static List<SelectItem> getWebsite_businesslist() {
//        return website_businesslist;
//    }
//
//    public static void setWebsite_businesslist(List<SelectItem> website_businesslist) {
//        BKBListData.website_businesslist = website_businesslist;
//    }
//
//    public static List<SelectItem> getWebsite_typelist() {
//        return website_typelist;
//    }
//
//    public static void setWebsite_typelist(List<SelectItem> website_typelist) {
//        BKBListData.website_typelist = website_typelist;
//    }
//
//    public static List<SelectItem> getWebsite_rulelist() {
//        return website_rulelist;
//    }
//
//    public static void setWebsite_rulelist(List<SelectItem> website_rulelist) {
//        BKBListData.website_rulelist = website_rulelist;
//    }
//
//    public static List<SelectItem> getWebsite_orderlist() {
//        return website_orderlist;
//    }
//
//    public static void setWebsite_orderlist(List<SelectItem> website_orderlist) {
//        BKBListData.website_orderlist = website_orderlist;
//    }
//
//    public static List<SelectItem> getWebsite_paymentlist() {
//        return website_paymentlist;
//    }
//
//    public static void setWebsite_paymentlist(List<SelectItem> website_paymentlist) {
//        BKBListData.website_paymentlist = website_paymentlist;
//    }
//
//    public static List<SelectItem> getWebsite_deliverylist() {
//        return website_deliverylist;
//    }
//
//    public static void setWebsite_deliverylist(List<SelectItem> website_deliverylist) {
//        BKBListData.website_deliverylist = website_deliverylist;
//    }

    public static List<SelectItem> getTb_titlelist() {
//        if(tb_titlelist == null){
//            tb_titlelist = DBUtils.getSelectItem("lookup_tb_title", "title_code", "title_nameth");
//        }
//        return tb_titlelist;
        
        List<SelectItem> listitem = getListData(TB_RDZONE);
        
        if( getListData(TB_TITLELIST) == null ){
        
            listitem    = DBUtils.getSelectItem("lookup_tb_title", "title_code", "title_nameth");
            
            putListData(TB_TITLELIST, listitem);
            
        }
        
        return listitem;
        
    }

    public static void setTb_titlelist(List<SelectItem> listitem) {
//        BKBListData.tb_titlelist = tb_titlelist;
        putListData(TB_TITLELIST, listitem); 
    }
    
//    public static List<SelectItem> getTb_titleenlist() {
//        if(tb_titleenlist == null){
//            tb_titleenlist = DBUtils.getSelectItem("lookup_tb_title", "title_code", "title_nameen");
//        }
//        return tb_titleenlist;
//    }
//
//    public static void setTb_titleenlist(List<SelectItem> tb_titleenlist) {
//        BKBListData.tb_titleenlist = tb_titleenlist;
//    }
//    
//    public static List<SelectItem> getTb_iobjectivelist() {
//        if(tb_iobjectivelist == null){
//            tb_iobjectivelist = DBUtils.getSelectItem("lookup_iobjective", "iobj_code", "iobj_descth");
//        }
//        return tb_iobjectivelist;
//    }
//
//    public static void setTb_iobjectivelist(List<SelectItem> tb_iobjectivelist) {
//        BKBListData.tb_iobjectivelist = tb_iobjectivelist;
//    }
//
//    public static List<SelectItem> getTb_investlist() {
//        if(tb_investlist == null){
//            tb_investlist = DBUtils.getSelectItem("lookup_tb_invest", "invest_code", "invest_desc");
//        }
//        return tb_investlist;
//    }
//
//    public static void setTb_investlist(List<SelectItem> tb_investlist) {
//        BKBListData.tb_investlist = tb_investlist;
//    }
//
//    public static List<SelectItem> getTb_nationality() {
//        if(tb_nationality == null){
//            tb_nationality = DBUtils.getSelectItem("lookup_tb_nationality", "nation_code", "nation_nameth");
//        }
//        return tb_nationality;
//    }
//
//    public static void setTb_nationality(List<SelectItem> tb_nationality) {
//        BKBListData.tb_nationality = tb_nationality;
//    }
//
//    public static List<SelectItem> getTb_cmowner_group() {
//        if(tb_cmowner_group ==null){
//            tb_cmowner_group    = DBUtils.getSelectItem("lookup_tb_cmowner_group", "cmown_grp_code", "cmown_grp_name");
//        }
//        return tb_cmowner_group;
//    }
//
//    public static void setTb_cmowner_group(List<SelectItem> tb_cmowner_group) {
//        BKBListData.tb_cmowner_group = tb_cmowner_group;
//    }
// 
//    
//
//    public static List<SelectItem> getTb_request() {
//        if(tb_request == null){
//            tb_request = DBUtils.getSelectItem("lookup_reqtpDesc", "reqtp_code", "reqtp_short");
//        }
//        return tb_request;
//    }
//
//    public static void setTb_request(List<SelectItem> tb_request) {
//        BKBListData.tb_request = tb_request;
//    }
//
    
    
    
    public static List<SelectItem> getTb_pkicard_sour() {
        
        
         List<SelectItem> listitem = getListData(TB_RDZONE);
        
        if( getListData(TB_RDZONE) == null ){
        
            listitem    = DBUtils.getSelectItem("lookup_tb_pkicard_sour", "card_sour_code", "card_sour_desc");
            
            putListData(TB_RDZONE, listitem);
            
        }
        
        return listitem;
        
    }

    public static void setTb_pkicard_sour(List<SelectItem> listitem) {
        putListData(TB_PKICARD_SOUR, listitem); 
    }

    public static List<SelectItem> getTb_rdzone() {
        
        List<SelectItem> listitem = getListData(TB_RDZONE);
        
        if( getListData(TB_RDZONE) == null ){
        
            listitem    = DBUtils.getSelectItem("lookup_tb_rdzone", "offzone_code", "offzone_name");
            
            putListData(TB_RDZONE, listitem);
            
        }
        
        return listitem;
    }
    
    public static List<SelectItem> getTb_rdzonesh() {
        
        List<SelectItem> listitem = getListData(TB_RDZONESH);
        
        if( getListData(TB_RDZONESH) == null ){
        
            listitem    = DBUtils.getSelectItem("lookup_tb_rdzone", "offzone_code", "offzone_namesh");
            
            putListData(TB_RDZONESH, listitem);
            
        }
        
        return listitem;
    }

    public static void setTb_rdzone(List<SelectItem> listitem) {
         putListData(TB_RDZONE, listitem); 
    }
      
    
    public static List<SelectItem> getComboTb10_meeting_room() {
        
        List<SelectItem> listitem = getListData(TB10_MEETING_ROOM);
        
        if( getListData(TB10_MEETING_ROOM) == null ){
        
            listitem    = DBUtils.getSelectItem("BTT030600Q", "room_desc", "room_desc");
            
            putListData(TB10_MEETING_ROOM, listitem);
            
        }
        
        return listitem;
    }
    
    public static List<SelectItem> getComboTb17_meeting_topic() {
        
        List<SelectItem> listitem = getListData(TB17_MEETING_TOPIC);
        
        if( getListData(TB17_MEETING_TOPIC) == null ){
        
            listitem    = DBUtils.getSelectItem("slcTb17MeetingTopic", "topic_desc", "topic_desc");
            
            putListData(TB17_MEETING_TOPIC, listitem);
            
        }
        
        return listitem;
    }
    
    public static List<SelectItem> getComboTb20_signName() {
        
        List<SelectItem> listitem = getListData(TB20_SIGN_NAME);
        
        if( getListData(TB20_SIGN_NAME) == null ){
        
            listitem    = DBUtils.getSelectItem("slctTb20SignName", "sign_name", "sign_name");
            
            putListData(TB20_SIGN_NAME, listitem);
            
        }
        
        return listitem;
    }
    
    public static List<SelectItem> getComboRd05_type_ref01() {
        
        String name     = "RD05_TYPE_REF01";
        List<SelectItem> listitem = getListData(name);
        
        
        if( listitem == null ){
                    
            
             HashMap<String, String> hm = new HashMap<String, String>();
             hm.put("grp_code", "01");
             hm.put("active_ind", "A");

             listitem    = DBUtils.getSelectItem("lookup_rd05_type_ref", hm ,"detl_code", "detl_name");
            
             putListData(name, listitem);
            
        }
        
        return listitem;
    }
    
    public static List<SelectItem> getComboRd05_type_ref02() {
        
        String name     = "RD05_TYPE_REF02";
        List<SelectItem> listitem = getListData(name);
        
        
        if( listitem == null ){
                    
            
             HashMap<String, String> hm = new HashMap<String, String>();
             hm.put("grp_code", "02");
             hm.put("active_ind", "A");

             listitem    = DBUtils.getSelectItem("lookup_rd05_type_ref", hm ,"detl_code", "detl_name");
            
             putListData(name, listitem);
            
        }
        
        return listitem;
    }
    
}
