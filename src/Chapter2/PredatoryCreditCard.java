package Chapter2;
import  java.lang.Math;


public class PredatoryCreditCard extends CreditCard {

//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		
//
//	}
	double apr;
	int noOfCharges;
	double lateFeeRate;
	double monthlyPayment;
	double monthlyPaymentPercentage;
	double totalPaidInMonth;
	
	public PredatoryCreditCard(String cust, String bk, String acnt, int lim, 
			double initialBal, double rate)
	{
		super(cust,bk,acnt,lim,initialBal);
		apr = rate;
	}
	
	private void noOfChargesReset()
	{
		noOfCharges=0;
	}
	
	private void setMonthlyPayment()
	{
		monthlyPayment= monthlyPaymentPercentage*balance;
	}
	
	public void processMonth()
	{
		if (totalPaidInMonth<monthlyPayment)
		{
			balance += monthlyPayment*lateFeeRate;
		}
		if (balance > 0)
		{
			double monthlyFactor = Math.pow(1+apr,1.0/12);		
			balance *= monthlyFactor;
		}
		//Reset the values of the no of charges for the month back to 0,
		//reset the monthly payment to its new value for the month, and
		//reset the total amount paid to 0.
		noOfChargesReset();
		setMonthlyPayment();
		totalPaidInMonth=0;
	}

	private void chargeCall()
	{
		noOfCharges++;
	}
	
	private void subCharge()
	{
		balance+=1;
	}
	public boolean charge(double price)
	{
		boolean isSuccess = super.charge(price);
		chargeCall();
		if (noOfCharges>10) subCharge(); 
		if (!isSuccess)
			balance += 5;
		return isSuccess;
	}
	
	public void makePayment(double amount)
	{
		balance -=amount;
		totalPaidInMonth += amount;
	}

}
