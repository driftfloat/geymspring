package ch8.proxyfactorybean;
/*  Author: kevin
 *	Date: 2018年6月4日
**/

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	private String txId;

	public String getTxId() {
		return txId;
	}

	public void setTxId(String txId) {
		this.txId = txId;
	}
	
	public void updateUser() {
		System.out.println("$$$业务逻辑$$$");
	}
	
}
