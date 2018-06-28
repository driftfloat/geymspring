package ch11.methodreplace;
/*  Author: kevin
 *	Date: 2018年6月28日
**/
public abstract class CommandManager {
	public Object process() {
		Command command = createCommand();
		System.out.println(command);
		preHandle(command);
		return command.execute();
	}
	public void preHandle(Command command) {
		System.out.println("preHandle:"+command);
	}
	public abstract Command createCommand();
}
