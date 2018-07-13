package ch4;
/*  Author: kevin
 *	Date: 2018年7月13日
**/
public class Science extends GirlDecorator {
	private Girl girl;
	public Science(Girl girl) {
		this.girl = girl;
	}
	@Override
	protected String getDescription() {
		return girl.getDescription() + " +Like Science";
	}
	
	public void caltulateStuff() {
		System.out.println("scientific calculation!");
	}
	
	
}
