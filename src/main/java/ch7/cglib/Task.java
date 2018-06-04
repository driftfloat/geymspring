package ch7.cglib;
/*  Author: kevin
 *	Date: 2018年6月2日
**/
public class Task {
	public String execute() {
		String message = "------test()---------" ;
		System.out.println(message);
		return message;
	}
	
	public void endTask() {
		System.out.println("end task");
	}
}
