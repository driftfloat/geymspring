package ch11.circlularity;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*  Author: kevin
 *	Date: 2018年6月28日
**/
public class CircularityMain2 {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("ch11-circularity-2.xml");
		System.out.println(context.getBean(CircularityA.class));
	}

}
