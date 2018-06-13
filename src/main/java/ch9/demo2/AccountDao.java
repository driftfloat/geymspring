package ch9.demo2;
/*  Author: kevin
 *	Date: 2018年6月12日
**/
public interface AccountDao {
	void inMoney(String in, Double money);
	void outMoney(String out, Double money);
}
