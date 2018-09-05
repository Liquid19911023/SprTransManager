package SpringTransaction.SprTrranManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDao accountDao;
	@Autowired
	private TransactionTemplate transactionTemplate;
	
    public void transfer(String outer, String inner, int money) {
    	
    	transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus arg0) {
            	 accountDao.out(outer, money);
                 int i = 1/0;
                 accountDao.in(inner, money);
            }
        });
       
    }

}
