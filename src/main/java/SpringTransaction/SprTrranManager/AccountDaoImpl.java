package SpringTransaction.SprTrranManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements AccountDao {

	@Autowired
	private Testbean testbean;
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	@Override
	public void in(String inner, int money) {
		jdbcTemplate.update("update test_account set momey = momey + ? where name = ?",money,inner); 
		System.out.println(testbean.getName());
	}

	@Override
	public void out(String outer, int money) {
		System.out.println(testbean.getName());
		jdbcTemplate.update("update test_account set momey = momey - ? where name = ?",money,outer);
	}
    
	
}
