package ch8.proxyfactorybean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*  Author: kevin
 *	Date: 2018年6月4日
**/
public class ProxyFactoryMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ch8-proxyfactorybean.xml");
		UserService us = (UserService)context.getBean("userService");
		us.updateUser();
	}

}













