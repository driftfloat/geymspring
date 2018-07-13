package ch6.ph;
/*  Author: kevin
 *	Date: 2018年7月13日
**/
public class HelloWorld {
	private String message;

	public String getMessage() {
		System.out.println("Your Message: "+ message);
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
