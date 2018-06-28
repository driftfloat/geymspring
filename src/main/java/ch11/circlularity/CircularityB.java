package ch11.circlularity;
/*  Author: kevin
 *	Date: 2018年6月28日
**/
public class CircularityB {
	private CircularityA circularityA;
	
	public CircularityB() {
	}
	public CircularityB(CircularityA circularityA) {
		this.circularityA = circularityA;
	}
	
	public void setCircularityA(CircularityA circularityA) {
		this.circularityA = circularityA;
	}
	public void b() {
		circularityA.a();
	}

}
