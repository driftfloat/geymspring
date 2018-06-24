package ch10.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import ch10.Member;

/*  Author: kevin
 *	Date: 2018年6月24日
**/
public class MemberFormatter implements Formatter<Member> {

	@Override
	public String print(Member object, Locale locale) {
		return object.getName();
	}

	@Override
	public Member parse(String text, Locale locale) throws ParseException {
		Member m = new Member();
		m.setName(text);
		return m;
	}
	
}
