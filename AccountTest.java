// AccountTest.java
// Inputting and outputting float-point numbers with Account objects

import java.util.Scanner;

public class AccountTest
{
	// main method begins execution of Java application
	public static void main(String [] args)
	{
		// create account object
		Account account1 = new Account(50.00);
		//create account object
		Account account2 = new Account(-7.53);

		// display initial balance of each object
		System.out.printf("account1 balance: $%.2f\n",
		   account1.getBalance() );
		System.out.printf("account2 balance: $%.2f\n"
			account2.getBalance() );

		// create scanner to obtain input from command window
		Scanner input = new Scanner( System.in );
		double depositAmount; // deposit amount read from user

		//prompt
		System.out.print("Enter the deposit amount for account1: ");

		//get user input
		depositAmount = input.nextDouble();
		System.out.printf("\nadding %.2f to account1 balance\n\n",
			depositAmount );
		account1.credit( depositAmount ); // Add to account1 balance

		//display balances
		System.out.printf("account1 balance: $%.2f\n",
			account1.getBalance() );
        System.out.printf("account2 balance: $%.2f\n",
        	account2.getBalance() );

        //prompts
        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("\nadding %.2f to account2 balance\n\n",
        	depositAmount );

        //display balances
        System.out.printf("account1 balance: $%.2f\n",
        	account1.getBalance() );
        System.out.printf("account2 balance: $%.2f\n",
        	account2.getBalance() );

	}// end main
}// and class AccountTest