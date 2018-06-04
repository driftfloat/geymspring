package ch7.postprocessor;

import java.lang.reflect.Method;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.util.ReflectionUtils;

/*  Author: kevin
 *	Date: 2018年6月2日
**/
public class DemoBeanPorstProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if("helloWorld".equals(beanName)) {
			Method method = ReflectionUtils.findMethod(bean.getClass(), "setMessage", String.class);
			ReflectionUtils.invokeMethod(method, bean, "Hello World from post processor");
		}
		return bean;
	}
	
}



















