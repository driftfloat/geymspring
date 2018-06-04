package ch7.aop2;

import java.util.regex.Pattern;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import net.sf.cglib.proxy.Enhancer;

/*  Author: kevin
 *	Date: 2018年6月2日
**/
public class AopBeanPorstProcessor implements BeanPostProcessor {
	private String regex;
	
	public String getRegex() {
		return regex;
	}

	public void setRegex(String regex) {
		this.regex = regex;
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(Pattern.matches(regex, bean.getClass().getSimpleName())) {
			return createProxy(bean);
		}
		return bean;
	}
	
	public static <T> T createProxy(Object obj) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(obj.getClass());
		enhancer.setCallback(new RegexInterceptor(obj));
		return (T)enhancer.create();
	}
}
