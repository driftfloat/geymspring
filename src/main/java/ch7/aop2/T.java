package ch7.aop2;

import java.util.regex.Pattern;

/*  Author: kevin
 *	Date: 2018年6月2日
**/
public class T {

	public static void main(String[] args) {
		String regex = "H+\\w+W\\w*";
//		Pattern.compile(regex).matcher(this).replaceFirst(replacement);
		String input = "HelloWorld";
		System.out.println(Pattern.matches(regex, input));
		input = "Hello";
		System.out.println(Pattern.matches(regex, input));
	}

}
