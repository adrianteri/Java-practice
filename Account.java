// Account.java
// Account class with a constructor to validate and initialize
// instance variable balance of type double

public class Account
{
	private double balance;// instance variable that stores the balance

	//constructor
	public Account(double initialBalance)
	{
		// validate that initialBalance is greater than 0.0;
		//If it's not, balance is initialized to default value 0.0

		if (initialBalance > 0.0)
			balance = initialBalance;

	}// end account constructor

	public void credit(double amount)
	{
		balance = balance + amount; // add amount to balance
	}// end method credit

	// return the account balance
	public double getBalance()
	{
		return balance; // gives the value of balance to the calling method
	}// end method getBalance
}// end class Account