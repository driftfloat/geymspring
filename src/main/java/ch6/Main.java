package ch6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*  Author: kevin
 *	Date: 2018年7月13日
**/
public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("ch6-post.xml");
		System.out.println(context.getBean(HelloWorld.class));
		System.out.println(context.getBean(HelloWorld.class));
		context.getBean(HelloWorld.class).getMessage();
	}

}
