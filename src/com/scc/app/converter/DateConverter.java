package com.scc.app.converter;

import com.scc.f1.util.Utils;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author terex
 */
@FacesConverter("dateConverter")
public class DateConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
//       System.out.println("Begin dateConverter getAsObject");
            String d = "";
            try {
                    d = string.replaceAll("/", "");
                    return d;
            } catch (Exception e) {
                    return d;
            }
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object obj) {
//        System.out.println("dateConverter.getAsString");
		String dFormat = "";
		try {
			String d = ((String) obj);
                        
                        dFormat = Utils.convertDateStringToScreen(d, "/");
			return dFormat;
		} catch (Exception e) {
			return dFormat;
		}
    }
    
}
