package com.scc.app.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("dlnConverter")
public class DlnConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
//		System.out.println("Begin DlnConverter getAsObject");
		String DLN = "";
		try {
			DLN = value.replaceAll("-", "");
			return DLN;
		} catch (Exception e) {
			return DLN;
		}
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
//		System.out.println("DlnConverter.getAsString");
		String DLNFormat = "";
		try {
			String DLN = ((String) value);
                        
                        if( DLN.length() > 35 ){
                            DLNFormat  = DLN.substring(0,DLN.length()-35) + "-" 
                                    + DLN.substring(DLN.length()-35,DLN.length()-27) + "-" 
                                    + DLN.substring(DLN.length()-27,DLN.length()-19) + "-" 
                                    + DLN.substring(DLN.length()-19,DLN.length()-16) + "-" 
                                    + DLN.substring(DLN.length()-16,DLN.length()-8) + "-" 
                                    + DLN.substring(DLN.length()-8,DLN.length()-7) + "-" 
                                    + DLN.substring(DLN.length()-7,DLN.length()-6) + "-" 
                                    + DLN.substring(DLN.length()-6,DLN.length()-2) + "-" 
                                    + DLN.substring(DLN.length()-2);
                                    
                        }else{
                            DLNFormat = DLN;
                        }
			return DLNFormat;
		} catch (Exception e) {
			return DLNFormat;
		}
	}

}
