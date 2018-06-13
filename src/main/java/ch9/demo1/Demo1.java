package ch9.demo1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.ibatis.jdbc.ScriptRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*  Author: kevin
 *	Date: 2018年6月12日
 *  编程式事务
**/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:")
public class Demo1 {
	@Resource(name="transactionProxyBean")
	private AccountService accountService;
	
	@Resource
	private DataSource dataSource;
	
	@Before
	public void setup() throws SQLException, FileNotFoundException, IOException{
		Connection con = dataSource.getConnection();
//		ScriptRunner sr = new ScriptRunner(con, true, false);
		ScriptRunner sr = new ScriptRunner(con);
		sr.runScript(new FileReader("./init.sql"));
		con.close();
	}
	
	public void teadDown() throws SQLException, FileNotFoundException, IOException{
		
	}
	
	/**
	 * 在测试本方法前，请先修改jdbc.properties配置文件中的数据库，并按给定的sql语句建表
	 * 
	 * 思路：
	 * 	1. DAO层通过JdbcTemplate 来操作数据库，简化代码
	 *  2. 使用TransactionTemplate管理事务，并向TransactionTemplate中注入事务管理器
	 *  3. 在Service层中直接调用TransactionTemplate的execute方法来执行业务
	 */
	@Test
	public void testTransfer() {
		accountService.transfer("aaa", "bbb", 100D);
		System.out.println("转账正常完成");
	}
	
}
