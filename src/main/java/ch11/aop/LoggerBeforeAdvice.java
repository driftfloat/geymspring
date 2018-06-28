package ch11.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/*  Author: kevin
 *	Date: 2018年6月28日
**/
public class LoggerBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("===保存日志 From LoggerBeforeAdvice ===");
	}

}
