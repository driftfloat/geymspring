package ch10.convert;

import java.beans.PropertyEditorSupport;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ch10.Member;

/*  Author: kevin
 *	Date: 2018年6月24日
**/
public class ListTypeEditSupport extends PropertyEditorSupport{

	@Override
	public String getAsText() {
		return getValue().toString();
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		if(text.contains(",")) {
			String[] aNames = text.split(",");
			List<Member> names = new ArrayList<Member>();
			for(int i=0;i<aNames.length;i++) {
				Member m = new Member();
				m.setName(aNames[i]);
				names.add(m);
			}
			setValue(names);
		}
		
	}
	
}
