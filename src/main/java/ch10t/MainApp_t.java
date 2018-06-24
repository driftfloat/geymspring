package ch10t;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/*  Author: kevin
 *	Date: 2018年6月24日
**/
public class MainApp_t {

	public static void main(String[] args) {
		final ConfigurableApplicationContext context =new ClassPathXmlApplicationContext("ch10-t.xml");
		Team obj = (Team)context.getBean("t");
		System.out.println(obj.getNames());
//		System.out.println(obj.getLeader());
//		Member member = (Member)context.getBean("member");
//		System.out.println(member);
	}
}
