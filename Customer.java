public class Customer {
	private int accNum;
	private double balance;
	public static double HIGH_CREDIT_LIMIT = 1000;

	public Customer(int accNum, double balance)
	{
		this.accNum = accNum;
		this.balance = balance;
		// if (balance > HIGH_CREDIT_LIMIT) 
		// 	throw(new HighBalanceException());
	}

	public void SemakBaki() throws HighBalanceException {
		if (balance > HIGH_CREDIT_LIMIT)
			throw(new HighBalanceException());
	}
}