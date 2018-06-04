package ch8.proxyfactory;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/*  Author: kevin
 *	Date: 2018年6月4日
**/
public class SecurityInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("===执行安全校验===");
		return invocation.proceed();
	}

}
