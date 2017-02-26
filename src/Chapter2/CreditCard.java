package Chapter2;

public class CreditCard {

	/**
	 * @param cust
	 */
//	public static void main(String[] args) 
//	{
//		
//	}
	String customer;
	String bank;
	String account;
	int limit;
	double balance;

	public CreditCard(String cust, String bk, String acnt, int lim, 
			double initialBal)
	{
		customer = cust;
		bank = bk;
		account = acnt;
		limit = lim;
		balance = initialBal;
	}
	
	public boolean charge(double price)
	{
		if (price + balance > limit)
			return false;
		balance += price;
		return true;
	}
	
	public void makePayment(double amount)
	{
		balance -=amount;
	}
}
