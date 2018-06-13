package ch9.demo4;

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
	
	@Override
	public void transfer(String out, String in, Double money) {
		accountDao.outMoney(out, money);
//		int i = 10/0;
		accountDao.inMoney(in, money);
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
}































