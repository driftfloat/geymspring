package ch7.postprocessor;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*  Author: kevin
 *	Date: 2018年6月2日
**/
public class MainApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("ch7-spring.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		System.out.println(obj.getMessage());
	}

}
