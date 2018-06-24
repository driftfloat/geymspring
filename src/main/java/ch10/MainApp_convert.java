package ch10;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*  Author: kevin
 *	Date: 2018年6月24日
**/
public class MainApp_convert {

	public static void main(String[] args) {
		final ConfigurableApplicationContext context =new ClassPathXmlApplicationContext("ch10-0.xml");
		Team obj = (Team)context.getBean("t");
		System.out.println(obj.getNames());
		System.out.println(obj.getLeader());
		
	}

}
