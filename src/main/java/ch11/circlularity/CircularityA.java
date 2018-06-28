package ch11.circlularity;
/*  Author: kevin
 *	Date: 2018年6月28日
**/
public class CircularityA {
	private CircularityB circularityB;
	
	public CircularityA() {
	}
	public CircularityA(CircularityB circularityB) {
		this.circularityB = circularityB;
	}
	
	public void setCircularityB(CircularityB circularityB) {
		this.circularityB = circularityB;
	}
	public void a() {
		circularityB.b();
	}
	
}
