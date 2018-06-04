package ch7.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.CallbackFilter;
import net.sf.cglib.proxy.Enhancer;

/*  Author: kevin
 *	Date: 2018年6月2日
**/
public class TaskInterceptorMain {

	public static void main(String[] args) {
		TaskInterceptorMain test = new TaskInterceptorMain();
		Task proxyTarget = (Task) test.createProxy(Task.class);
		String res = proxyTarget.execute();
		proxyTarget.endTask();
	}
	
	public Object createProxy(Class targetClass) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(targetClass);
		enhancer.setCallbacks(new Callback[] {new TaskInterceptor(), new TaskInterceptor2()});
		enhancer.setCallbackFilter(new CallbackFilter() {
			@Override
			public int accept(Method method) {
				if("execute".equals( method.getName())) {
					return 0;
				}
				return 1;
			}
		});
		return enhancer.create();
	}

}
