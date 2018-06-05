package ch8.aopconfig;

import org.springframework.stereotype.Service;
import org.aspectj.lang.JoinPoint;

/*  Author: kevin
 *	Date: 2018年6月4日
**/
@Service("preDo")
public class PreDo {

	public String toPre(JoinPoint point) {
		System.out.println("参数:"+point.getArgs()[0]);
		System.out.println("洗手");
		return "洗手";
	}


}
