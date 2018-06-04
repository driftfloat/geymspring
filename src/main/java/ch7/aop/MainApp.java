package ch7.aop;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*  Author: kevin
 *	Date: 2018年6月2日
**/
public class MainApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("ch7-aop.xml");
		DBQuery obj =  context.getBean(DBQuery.class);
		String re = obj.request("aaa");
		System.out.println(re);
	}

}
