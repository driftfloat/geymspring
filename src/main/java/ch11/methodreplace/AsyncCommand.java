package ch11.methodreplace;
/*  Author: kevin
 *	Date: 2018年6月28日
**/
public class AsyncCommand implements Command {

	@Override
	public Object execute() {
		System.out.println("Async command execute.");
		return "Execute result.";
	}

}
