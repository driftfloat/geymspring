package ch9.demo0;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

/*  Author: kevin
 *	Date: 2018年6月12日
**/
public class AccountDaoImpl implements AccountDao {
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void inMoney(String in, Double money) {
		this.jdbcTemplate.update(
				"update account set money = (money + ?) where name = ?",
				money, in
				);
	}

	@Override
	public void outMoney(String out, Double money) {
		this.jdbcTemplate.update(
				"update account set money = (money - ?) where name = ?",
				money, out
				);
	}
	
}

























