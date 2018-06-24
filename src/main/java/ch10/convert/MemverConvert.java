package ch10.convert;

import org.springframework.core.convert.converter.Converter;

import ch10.Member;

/*  Author: kevin
 *	Date: 2018年6月24日
**/
public class MemverConvert implements Converter<String, Member> {

	@Override
	public Member convert(String source) {
		Member m = new Member();
		return m;
	}
	
}
