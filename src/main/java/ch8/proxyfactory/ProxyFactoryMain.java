package ch8.proxyfactory;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

/*  Author: kevin
 *	Date: 2018年6月4日
**/
public class ProxyFactoryMain {

	public static void main(String[] args) {
		UserServiceImpl target = new UserServiceImpl();
		target.setTxId("11");
		ProxyFactory pf = new ProxyFactory(target);
//		pf.setFrozen(true);
		pf.addAdvice(new SecurityInterceptor());
		pf.addAdvisor(new DefaultPointcutAdvisor(new LoggerBeforeAdvice()));
		UserServiceImpl proxy = (UserServiceImpl)pf.getProxy();
		System.out.println(proxy.getClass());
		proxy.updateUser();
	}

}












