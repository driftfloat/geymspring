package ch9.demo0;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.ibatis.jdbc.ScriptRunner;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*  Author: kevin
 *	Date: 2018年6月12日
 *  编程式事务
**/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:")
public class Demo0 {
	@Resource
	private AccountService accountService;
	
	@Resource
	private DataSource dataSource;
	
//	public void 
	
	public void setup() throws SQLException, FileNotFoundException, IOException{
		Connection con = dataSource.getConnection();
//		ScriptRunner sr = new ScriptRunner(con, true, false);
		ScriptRunner sr = new ScriptRunner(con);
		sr.runScript(new FileReader(""));
		con.close();
	}
	
	public void teadDown() throws SQLException, FileNotFoundException, IOException{
		
	}
	
}
