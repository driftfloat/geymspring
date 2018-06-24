package ch10;

import java.util.Arrays;

/*  Author: kevin
 *	Date: 2018年6月24日
**/
public class Member {
	private String name;
	private byte[] code;

	public byte[] getCode() {
		return code;
	}

	public void setCode(byte[] code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", code=" + Arrays.toString(code) + "]";
	}





	
}
