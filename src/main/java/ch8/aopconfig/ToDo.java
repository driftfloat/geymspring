package ch8.aopconfig;

import org.springframework.stereotype.Service;

/*  Author: kevin
 *	Date: 2018年6月4日
**/
@Service
public class ToDo implements IToDo {

	@Override
	public String toEat(String food) {
		System.out.println("吃" + food);
		return "吃" + food;
	}

}
