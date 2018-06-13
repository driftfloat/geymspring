package ch9.demo0;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/*  Author: kevin
 *	Date: 2018年6月12日
**/
@Repository
public class AccountDaoImpl implements AccountDao {
	private JdbcTemplate jdbcTemplate;
	
	@Resource
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

























