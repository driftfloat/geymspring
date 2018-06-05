package ch8.aopconfigannotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/*  Author: kevin
 *	Date: 2018年6月4日
**/
@Aspect
@Component
public class PreDo {
	@Pointcut("execution(public * ch8.aopconfigannotation.ToDo.toEat(..))")
	public void toDoPoint() {}
	
	@Before("toDoPoint()")
	public String toPre(JoinPoint point) {
		System.out.println("参数:"+point.getArgs()[0]);
		System.out.println("洗手");
		return "洗手";
	}


}
