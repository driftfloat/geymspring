package ch10.convert;

import java.beans.PropertyEditorSupport;
import java.util.Arrays;

/*  Author: kevin
 *	Date: 2018年6月24日
**/
public class ArrayTypeEditSupport extends PropertyEditorSupport{

	@Override
	public String getAsText() {
		return getValue().toString();
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		if(text.contains(" ")) {
			String[] aNames = text.split(" ");
			Byte[] bs = new Byte[aNames.length];
			for(int i=0;i<aNames.length ; i++) {
				byte b = (byte) Integer.parseInt(aNames[i].substring(2), 16);
				bs[i] = b; 
			}
			setValue(Arrays.asList(bs));
		}
		
	}
	
}
