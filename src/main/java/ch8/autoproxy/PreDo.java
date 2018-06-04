package ch8.autoproxy;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

/*  Author: kevin
 *	Date: 2018年6月4日
**/
@Component
public class PreDo implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("参数:"+args[0]);
		System.out.println("洗手");
	}


}
