package ch7.aop2;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/*  Author: kevin
 *	Date: 2018年6月2日
**/
public class RegexInterceptor implements MethodInterceptor {
	Object target;
	
	public RegexInterceptor(Object target) {
		this.target = target;
	}
	
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		System.out.println("query ID for " +obj.getClass().getSimpleName() );
		Object result = methodProxy.invoke(target, args);  // 
		return result;
	}
}
