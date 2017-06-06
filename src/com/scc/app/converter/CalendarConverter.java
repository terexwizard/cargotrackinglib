package com.scc.app.converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
@FacesConverter("calendarConverter")
public class CalendarConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
//		System.out.println(">>Begin CalendarConverter getAsObject "+value);
		String num = "";
                int dd = 0;
                int mm = 0;
                int yy = 0;
                Date d = null;
                String msgErr = "วันที่ไม่ถูกต้อง รูปแบบ dd/mm/yyyy (ตัวอย่าง 01/01/2556)";
		try {
			num = value.replaceAll("/", "");
                        Calendar cl = Calendar.getInstance(Locale.ENGLISH);
                        
                        if(num.length() == 1){
                            num = "0"+num;
                            num += (cl.get(Calendar.MONTH) +1) < 10?"0"+(cl.get(Calendar.MONTH) +1):(cl.get(Calendar.MONTH) +1);
                            //num += cl.get(Calendar.YEAR) +543;
                            num += cl.get(Calendar.YEAR);
                        }
                        
                        if(num.length() == 2){
                            num += (cl.get(Calendar.MONTH) +1) < 10?"0"+(cl.get(Calendar.MONTH) +1):(cl.get(Calendar.MONTH) +1);
                            //num += cl.get(Calendar.YEAR) +543;
                            num += cl.get(Calendar.YEAR);
                        }
                        
                        if(num.length() == 4){
                            //num += cl.get(Calendar.YEAR) +543;
                            num += cl.get(Calendar.YEAR);
                        }
                        
                        if(num.length() == 8){
                            
                            dd = Integer.parseInt(num.substring(0,2));
                            mm = Integer.parseInt(num.substring(2,4));
                            yy = Integer.parseInt(num.substring(4));
                            
                            //if(yy > 2500 && isDateValid(num.substring(0,4)+String.valueOf(yy-543))){
                            if(yy < 2500 && isDateValid(num.substring(0,4)+String.valueOf(yy))){
//                                System.out.println(">>Begin CalendarConverter getAsObject "+dd+"/"+mm+"/"+yy);
                                                                        
                                //cl.set(yy-543, mm - 1, dd);
                                cl.set(yy, mm - 1, dd);
                                
                                d = new Date();
//                                d.setDate(dd);
//                                d.setMonth(mm - 1);
//                                d.setYear(yy - 2443);
                                d = cl.getTime();
                            }else{
                                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR,msgErr,msgErr)); 
                            }
                        }
                        
			
                        
                        
                        
		} catch (Exception e) {
                    d = new Date();
                    e.printStackTrace();
                    throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR,msgErr,msgErr)); 
		}
                
                return d;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component,Object value) {
//		System.out.println(">>Begin CalendarConverter getAsString "+value);
		String dateThaiFormat = "";
                
                String ddmm = "";
                int yy = 0;
                
		try {
                    Date d = (Date)value;
                    DateFormat df = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                    dateThaiFormat = df.format(d);
//                    System.out.println(">>after CalendarConverter check "+dateThaiFormat);
                    if(!dateThaiFormat.equals("")){
                        
                        
                        ddmm = dateThaiFormat.substring(0,5);
                        yy = Integer.parseInt(dateThaiFormat.substring(6));
                        
//                        if(yy < 2500){
//                            yy = (yy+543);
//                            
////                             System.out.println(">>after CalendarConverter terex getAsString "+yy);
//                        }
                        
                        dateThaiFormat = ddmm+"/"+yy;
                    }
                    
//                    System.out.println(">>after CalendarConverter getAsString "+dateThaiFormat);
                    
                    return dateThaiFormat;
		} catch (Exception e) {
                    return dateThaiFormat;
		}
	}
        
        public static boolean isDateValid(String date) 
        {
                try {
                    DateFormat df = new SimpleDateFormat("ddMMyyyy", Locale.ENGLISH);
                    df.setLenient(false);
                    df.parse(date);
                    return true;
                } catch (ParseException e) {
                    return false;
                }
        }

}
