package ch11.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/*  Author: kevin
 *	Date: 2018年6月28日
**/
public class LoggerBeforeAdvice2  {

	public void before()  {
		System.out.println("===before From LoggerBeforeAdvice2 ===");
	}

}
