package ch4;
/*  Author: kevin
 *	Date: 2018年7月13日
**/
public class Main {
	public static void main(String[] args) {
		//普通美国女孩
		Girl g1 = new AmericanGirl();
		System.out.println(g1.getDescription());
		
		//喜欢科学的
		Science g2 = new Science(g1);
		System.out.println(g2.getDescription());
		
		//喜欢科学和艺术的
		Art g3 = new Art(g2);
		System.out.println(g3.getDescription());
	}
}
