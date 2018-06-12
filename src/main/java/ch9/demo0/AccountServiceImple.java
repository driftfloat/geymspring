package ch9.demo0;

import javax.annotation.Resource;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

/*  Author: kevin
 *	Date: 2018年6月12日
**/
public class AccountServiceImple implements AccountService {
	private AccountDao accountDao;
	
	private DataSourceTransactionManager txManager;
	
	@Override
	public void transfer(String out, String in, Double money) {
		DefaultTransactionDefinition def1 = new DefaultTransactionDefinition();
		def1.setIsolationLevel(TransactionDefinition.ISOLATION_READ_COMMITTED);
		def1.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		
//		DefaultTransactionDefinition def2 = new DefaultTransactionDefinition();
//		def2.setIsolationLevel(TransactionDefinition.ISOLATION_READ_COMMITTED);
//		def2.setPropagationBehavior(TransactionDefinition.PROPAGATION_NESTED);
		
		TransactionStatus status1 = txManager.getTransaction(def1);
//		TransactionStatus status2 = txManager.getTransaction(def2);
		
		accountDao.outMoney(out, money);
		int i = 10 /0;
		accountDao.inMoney(in, money);
		
//		txManager.commit(status2);
		txManager.commit(status1);
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public void setTxManager(DataSourceTransactionManager txManager) {
		this.txManager = txManager;
	}

}















