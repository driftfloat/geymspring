package ch8.aopconfig;

import java.util.Iterator;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*  Author: kevin
 *	Date: 2018年6月4日
**/
public class MainAppAop {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ch8-aopconfig.xml");
		IToDo obj = context.getBean(ToDo.class) ;
		obj.toEat("苹果");
		
		Iterator<String> names = context.getBeanFactory().getBeanNamesIterator();
		while(names.hasNext()) {
			String beanName = names.next();
			System.out.println(beanName + ":"+ context.getBeanFactory().getBean(beanName).getClass());
		}
	}

}















