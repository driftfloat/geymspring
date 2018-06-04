package ch7.aop2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*  Author: kevin
 *	Date: 2018年6月2日
**/
public class MainApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("ch7-aop2.xml");
		HelloWorld obj =  context.getBean(HelloWorld.class);
		String re = obj.getMessage();
		System.out.println(re);
		
		Hello obj2 =  context.getBean(Hello.class);
		re = obj2.getMessage();
		System.out.println(re);
	}
}
