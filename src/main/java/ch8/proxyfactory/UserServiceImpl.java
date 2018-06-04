package ch8.proxyfactory;
/*  Author: kevin
 *	Date: 2018年6月4日
**/
public class UserServiceImpl {
	private String txId;

	public String getTxId() {
		return txId;
	}

	public void setTxId(String txId) {
		this.txId = txId;
	}
	
	public void updateUser() {
		System.out.println(txId+":$$$业务逻辑$$$");
	}
	
}
