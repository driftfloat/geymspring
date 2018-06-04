package ch7.aop;

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
		Object result = methodProxy.invoke(target, args);  // 
		
		// 想调用父类方法，不能直接target, 需要 invokeSuper 
//		Object result = methodProxy.invokeSuper(obj, args);  
		return result;
	}

}
