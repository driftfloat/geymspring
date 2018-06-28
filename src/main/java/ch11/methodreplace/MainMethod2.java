package ch11.methodreplace;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*  Author: kevin
 *	Date: 2018年6月28日
**/
public class MainMethod2 {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("ch11-methodreplace-1.xml");
//		Manager m = context.getBean("manager", Manager.class);
		CommandManager m = context.getBean("commandManager", CommandManager.class);
		for(int i=0; i<5; i++) {
			m.process();
		}
		context.close();
	}

}
