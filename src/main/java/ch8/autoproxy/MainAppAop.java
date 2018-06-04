package ch8.autoproxy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*  Author: kevin
 *	Date: 2018年6月4日
**/
public class MainAppAop {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ch8-autoproxy.xml");
		IToDo obj = (IToDo) context.getBean("toDo") ;
		obj.toEat("苹果");
	}

}
