
// Program 3 - Program to learn loops statements by making a loan program
// Programmer: Benjamin Crist

import javax.swing.*;

public class LoanCalculator {

	public static void main( String[] args ) {
		
		//get loan amount
		int amount = 0;
		while ((amount < 1000) || (amount > 100000)){
			String amtStr = JOptionPane.showInputDialog( "What is the amount of the loan? You need to enter a number between 1,000 and 100,000.");
			amount = Integer.parseInt( amtStr );

			//error message to user
			if ((amount < 1000) || (amount > 100000)){
				JOptionPane.showMessageDialog(null, "The loan amount you entered is not valid.");
			}
		}
		
		//get monthly payment
		
		//checking to see what is 1% and 25% of loan amount
		int onePercentLoan = amount / 100;
		int twentyFivePercentLoan = amount / 4;
		
		int payment = 0;
		while ((payment < onePercentLoan) || (payment > twentyFivePercentLoan)){
			String paymtStr = JOptionPane.showInputDialog( "What is the monthly payment? Your payment must be between 1% and 25% of the loan.");
			payment = Integer.parseInt( paymtStr );
			
			//error message to user
			if ((payment < onePercentLoan) || (payment > twentyFivePercentLoan)){
				JOptionPane.showMessageDialog(null, "The payment you entered is not valid.");
			}	
		}
		
		
		//get interest rate
		double intRate = 0;
		while ((intRate < 1) || (intRate > 25)){

			String irStr = JOptionPane.showInputDialog( "What is the annual interest rate %? The rate must be between 1 and 25%");
			intRate = Double.parseDouble( irStr );
			
			//error message to user
			if ((intRate < 1) || (intRate > 25)){
				JOptionPane.showMessageDialog(null, "The interest rate you entered is not valid.");
			}
		}

	
		//declaring and initializing variables
		boolean principalNotZero = true;
		double unpaidBalance = 0.0;
		double monthlyIntRate = 0.0;
		double monthlyPayment = 0.0;
		String paymentString = "";
		double totalInterest = 0.0;
		int paymentNr = 1;
		
		//bringing in the user input
		unpaidBalance = amount;
		monthlyIntRate = intRate / 1200.;
		monthlyPayment = payment;

        //printing header for table output
		System.out.println( "Payment Nr.  Interest  Principal  Unpaid Balance  Total Interest ");
		
		//computing interest
		while ( principalNotZero ) {
			double principalPaid;
			long intInCents = Math.round(100 * unpaidBalance * monthlyIntRate );
			double intThisMonth = intInCents / 100.0;
			totalInterest += intThisMonth;

			//computing what is owed, if else statement to cover final payment
			if ( (unpaidBalance + intThisMonth) >= monthlyPayment ) {
				principalPaid = monthlyPayment - intThisMonth;
				unpaidBalance -= principalPaid;
				System.out.printf( "%3d          %8.2f   %8.2f        %8.2f       %8.2f\n",
					paymentNr, intThisMonth, principalPaid,
					unpaidBalance, totalInterest);
				paymentNr++;
			}
			else {  
				principalPaid = unpaidBalance;
				unpaidBalance = 0.0;
				System.out.printf( "%3d          %8.2f   %8.2f        %8.2f       %8.2f\n",
					paymentNr, intThisMonth, principalPaid,
					unpaidBalance, totalInterest);
				principalNotZero = false;
			}


		}



	}

}
