package ch11.aop;
/*  Author: kevin
 *	Date: 2018年6月28日
**/
public class HelloService {
	private Target target;

	public void setTarget(Target target) {
		this.target = target;
	}
	public void sayHello() {
		target.sayHello();
	}
}
