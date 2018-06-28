package ch11.aop;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*  Author: kevin
 *	Date: 2018年6月28日
**/
public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"ch11-aop-spring-config.xml",
				"ch11-aop-other-config.xml"
				);
		HelloService myBean = context.getBean("myBean", HelloService.class);
		myBean.sayHello();
	}

}
