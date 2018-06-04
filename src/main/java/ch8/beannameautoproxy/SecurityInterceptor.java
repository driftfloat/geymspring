package ch8.beannameautoproxy;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

/*  Author: kevin
 *	Date: 2018年6月4日
**/

@Component
public class SecurityInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("===执行安全校验===");
		return invocation.proceed();
	}

}
