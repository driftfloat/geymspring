package ch7.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/*  Author: kevin
 *	Date: 2018年6月2日
**/
public class TaskInterceptor2 implements MethodInterceptor {
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		System.out.println(">>>MethodInterceptor2 start...");
		Object result = methodProxy.invokeSuper(obj, args);
		System.out.println(">>>MethodInterceptor2 ending...");
		return result;
	}

}
