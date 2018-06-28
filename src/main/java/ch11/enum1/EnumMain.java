package ch11.enum1;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ch11.circlularity.CircularityA;

/*  Author: kevin
 *	Date: 2018年6月28日
**/
public class EnumMain {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("ch11-circularity-1.xml");
		System.out.println(context.getBean(Car.class).getColorEnum());
	}

}
