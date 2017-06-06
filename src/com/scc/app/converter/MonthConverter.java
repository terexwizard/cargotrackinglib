package com.scc.app.converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author terex
 */
@FacesConverter("monthConverter")
public class MonthConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
//		System.out.println(">>Begin MonthConverter getAsObject "+value);
		String num = "";
                String mm = "";

		try {
			num = value;
                        
                        if(num.length() == 1){
                            num = "0"+num;
                        }
                        
                        
                        if(num.length() == 2){
                            
                            if(isMonthValid(num)){
                               
                               mm = num;
//                               System.out.println(">>Begin MonthConverter getAsObject "+mm);
                            }else{
                                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "เดือนไม่ถูกต้อง","เดือนไม่ถูกต้อง")); 
                            }
                        }
                        
			
                        
                        
                        
		} catch (Exception e) {
                    mm = "";
                    e.printStackTrace();
                    throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "เดือนไม่ถูกต้อง","เดือนไม่ถูกต้อง")); 
		}
                
                return mm;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component,Object value) {
//		System.out.println(">>Begin MonthConverter getAsString "+value);
		String month = "";
		try {

                    month = String.valueOf(value);
                    
//                    System.out.println(">>after MonthConverter getAsString "+month);
                    
                    return month;
		} catch (Exception e) {
                    return month;
		}
	}
        
        public static boolean isMonthValid(String month) 
        {
                try {
                    DateFormat df = new SimpleDateFormat("MM", Locale.ENGLISH);
                    df.setLenient(false);
                    df.parse(month);
                    return true;
                } catch (ParseException e) {
                    return false;
                }
        }

}
