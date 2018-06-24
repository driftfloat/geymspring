package ch10.convert;

import java.beans.PropertyEditorSupport;
import java.util.Arrays;

/*  Author: kevin
 *	Date: 2018年6月24日
**/
public class _ListTypeEditSupport extends PropertyEditorSupport{

	@Override
	public String getAsText() {
		return getValue().toString();
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		if(text.contains(",")) {
			String[] aNames = text.split(",");
			setValue(Arrays.asList(aNames));
		}
		
	}
	
}
