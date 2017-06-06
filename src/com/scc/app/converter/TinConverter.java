package com.scc.app.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("tinConverter")
public class TinConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
//		System.out.println("Begin TinConverter getAsObject");
		String NID = "";
		try {
			NID = value.replaceAll("-", "");
			return NID;
		} catch (Exception e) {
			return NID;
		}
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
//		System.out.println("NidConverter.getAsString");
		String NIDFormat = "";
		try {
			String TIN = ((String) value);
			NIDFormat = TIN.substring(0, 1) + "-" + TIN.substring(1, 5) + "-"
						+ TIN.substring(5, 9) + "-" + TIN.substring(9, 10);
			return NIDFormat;
		} catch (Exception e) {
			return NIDFormat;
		}
	}

}
