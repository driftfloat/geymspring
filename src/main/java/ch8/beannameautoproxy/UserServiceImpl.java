package ch8.beannameautoproxy;
/*  Author: kevin
 *	Date: 2018年6月4日
**/

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	@Override
	public void updateUser() {
		System.out.println("$$$业务逻辑$$$");
	}
	
}
