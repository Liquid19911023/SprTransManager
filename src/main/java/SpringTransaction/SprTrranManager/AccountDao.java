package SpringTransaction.SprTrranManager;

public interface AccountDao {

	public void in(String inter, int money);
	
	public void out(String outer, int money);
}
