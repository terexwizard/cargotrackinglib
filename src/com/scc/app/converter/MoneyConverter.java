package com.scc.app.converter;

import com.scc.f1.util.Utils;
import java.math.BigDecimal;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import javax.faces.convert.NumberConverter;

@FacesConverter("moneyConverter")
public class MoneyConverter extends NumberConverter {

    public MoneyConverter() {
//        setCurrencySymbol("");
//        setGroupingUsed(true);
//        setMaxFractionDigits(2);
//        setType("currency");
        setPattern("#,##0.00");
    }

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        
            BigDecimal b = null;
            
            try{	
//                System.out.println(">>Begin MoneyConverter getAsObject "+value);
                
                if(!Utils.NVL(value).equals("")){
                        if(isNumeric(value)){
                            b = new BigDecimal(value.replace(",", ""));
                        }else{
                            b = new BigDecimal("0");
                            //throw new ConverterException(new FacesMessage("ข้อมูลไม่ถูกต้อง")); 
                        }
                }

            }catch(NumberFormatException ne){
                    b = new BigDecimal("0");
                    ne.printStackTrace();
                    throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "ข้อมูลไม่ถูกต้อง","ข้อมูลไม่ถูกต้อง")); 
            }
            
            return b;
        
    }
    
    
    private static boolean isNumeric(String str)  
    {  
      try  
      {  
        str = str.replace(",", "");
        double d = Double.parseDouble(str);  
      }  
      catch(NumberFormatException nfe)  
      {  
        return false;  
      }  
      return true;  
    }

    
    
    
    

}
