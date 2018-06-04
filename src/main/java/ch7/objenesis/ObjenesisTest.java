package ch7.objenesis;

import org.objenesis.Objenesis;
import org.objenesis.ObjenesisStd;
import org.objenesis.instantiator.ObjectInstantiator;

/*  Author: kevin
 *	Date: 2018年6月2日
**/
public class ObjenesisTest {

	public static void main(String[] args) {
		Objenesis objenesis = new ObjenesisStd();
		ObjectInstantiator<User> thingyInstantiator = objenesis.getInstantiatorOf(User.class);
		User user = thingyInstantiator.newInstance();
		user.setId(1);
		user.setName("xiaoming");
		System.out.println(user.getName());
		
				
	}

}
