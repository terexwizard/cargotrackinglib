/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scc.app.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author anna
 */
@FacesConverter("pinTinConverter")
public class PinTinConverter implements Converter{
 
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
//            System.out.println("Begin PinConverter getAsObject");
            String NID = "";
            try {
                    NID = value.replaceAll("-", "");
                    return NID;
            } catch (Exception e) {
                    return NID;
            }
    }  
    
    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
//        System.out.print("PinTinConverter.getAsString");
        String NIDFormat = "";
        try{
            if(value.toString().length()== 10){
                String PIN = ((String) value);
                NIDFormat = PIN.substring(0, 1) + "-" + PIN.substring(1, 5) + "-" + 
                            PIN.substring(5, 9) + "-" + PIN.substring(9, 10);  
            }else if(value.toString().length()== 13){
                String TIN = ((String) value); 
                NIDFormat = TIN.substring(0, 1) + "-" + 
                            TIN.substring(1, 5) + "-" +
                            TIN.substring(5, 10) + "-" + 
                            TIN.substring(10, 12)+ "-" + 
                            TIN.substring(12);  
            }
            return NIDFormat;
        }catch (Exception e){
            return NIDFormat;
        }
        
    } 
}
