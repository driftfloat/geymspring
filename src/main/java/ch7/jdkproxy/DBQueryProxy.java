package ch7.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/*  Author: kevin
 *	Date: 2018年6月2日
**/
public class DBQueryProxy implements InvocationHandler {
	private Object target;
	
	public Object bind(Object target) {
		this.target = target;
		//取得代理对象
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("query ID:" + args[0]);
		Object result = method.invoke(target, args);
		return result;
	}
	
}	

























