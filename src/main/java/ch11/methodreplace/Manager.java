package ch11.methodreplace;
/*  Author: kevin
 *	Date: 2018年6月28日
**/
public class Manager {
	private AsyncCommand command;
	
	public void setCommand(AsyncCommand command) {
		this.command = command;
	}


	public void process() {
		command.execute();
		System.out.println(command);
	}
}
