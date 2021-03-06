package ch9.demo1;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/*  Author: kevin
 *	Date: 2018年6月12日
**/
@Service
public class AccountServiceImple implements AccountService {
	@Resource
	private AccountDao accountDao;
	
//	private DataSourceTransactionManager txManager;
	
	@Resource
	private TransactionTemplate transactionTemplate;
	
	@Override
	public void transfer(String out, String in, Double money) {
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {

			@Override
			protected void doInTransactionWithoutResult(TransactionStatus status) {
				accountDao.outMoney(out, money);
				int i = 10 /0;
				accountDao.inMoney(in, money);
			}});
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

}































