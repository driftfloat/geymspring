package ch7.cglibproxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/*  Author: kevin
 *	Date: 2018年6月2日
**/
public class DBQueryInterceptor implements MethodInterceptor {
	Object target;
	
	public DBQueryInterceptor(Object target) {
		this.target = target;
	}
	
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		System.out.println("query ID:" + args[0]);
//		Object result = methodProxy.invoke(target, args);  // 
		
		// 想调用父类方法，不能直接target, 需要 invokeSuper 
//		Object result = methodProxy.invokeSuper(obj, args);  
		
		Object result = method.invoke(target, args);  
		
		// 这样会出错  死循环
//		Object result = methodProxy.invoke(obj, args);  
//		Object result = method.invoke(obj, args);  
		return result;
	}
	
}



















