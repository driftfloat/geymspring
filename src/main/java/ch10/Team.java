package ch10;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.NumberFormat;

/*  Author: kevin
 *	Date: 2018年6月24日
**/
public class Team {
	private List<Member> names;

	public List<Member> getNames() {
		return names;
	}

	public void setNames(List<Member> names) {
		this.names = names;
	}

}
