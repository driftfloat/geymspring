package ch7.aop;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import net.sf.cglib.proxy.Enhancer;

/*  Author: kevin
 *	Date: 2018年6月2日
**/
public class AopBeanPorstProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(bean.getClass().equals(DBQuery.class)) {
			return createProxy(bean);
		}
		return bean;
	}
	
	public static <T> T createProxy(Object obj) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(obj.getClass());
		enhancer.setCallback(new DBQueryInterceptor(obj));
		return (T)enhancer.create();
	}

}
