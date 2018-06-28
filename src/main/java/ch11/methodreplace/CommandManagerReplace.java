package ch11.methodreplace;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

/*  Author: kevin
 *	Date: 2018年6月28日
**/
public class CommandManagerReplace implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("replace preHandle method, new preHandle for:"+args[0]);
		return null;
	}

}
