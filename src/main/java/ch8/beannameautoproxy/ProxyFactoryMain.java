package ch8.beannameautoproxy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*  Author: kevin
 *	Date: 2018年6月4日
**/
public class ProxyFactoryMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ch8-beannameautoproxy.xml");
		UserService us = context.getBean("userServiceImpl", UserService.class);
		us.updateUser();
	}

}













