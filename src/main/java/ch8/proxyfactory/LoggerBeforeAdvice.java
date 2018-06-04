package ch8.proxyfactory;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.MethodBeforeAdvice;

/*  Author: kevin
 *	Date: 2018年6月4日
**/
public class LoggerBeforeAdvice implements MethodBeforeAdvice{
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("===保存更新日志===");
	}

}
