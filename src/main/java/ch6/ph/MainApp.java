package ch6.ph;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*  Author: kevin
 *	Date: 2018年7月13日
**/
public class MainApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("ch6-ph.xml");
		HelloWorld obj = (HelloWorld)context.getBean("helloWorld");
		obj.getMessage();
	}

}
