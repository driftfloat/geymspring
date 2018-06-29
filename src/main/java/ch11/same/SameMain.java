package ch11.same;

import org.springframework.context.support.GenericXmlApplicationContext;

/*  Author: kevin
 *	Date: 2018年6月28日
**/
public class SameMain {
	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.setAllowBeanDefinitionOverriding(false);
		context.load("classpath:ch11-same-1.xml","ch11-same-2.xml");  
		context.refresh();
		System.out.println(context.getBean("person"));
	}
}
