package ch7.jdkproxy;
/*  Author: kevin
 *	Date: 2018年6月2日
**/
public class DBQuery implements IDBQuery{
	
	@Override
	public String request(String id) {
		return "request string for arg:"+id;
	}
}
