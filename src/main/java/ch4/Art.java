package ch4;
/*  Author: kevin
 *	Date: 2018年7月13日
**/
public class Art extends GirlDecorator {
	private Girl girl;
	public Art(Girl girl) {
		this.girl = girl;
	}
	@Override
	protected String getDescription() {
		return girl.getDescription() + " +Like Art";
	}
	
	public void caltulateStuff() {
		System.out.println("draw pictures!");
	}
	
	
}
