// Program 3 - Program to learn selection statements by making a calendar program
// Programmer: Benjamin Crist

//bring in functions
import javax.swing.JOptionPane;

public class HowManyDays {
	public static void main (String [] args) {
		
		//numberOfDays is what we want to know, so declaring it now
		int numberOfDays = 0;
		
		//ask user to submit month
		int month = Integer.parseInt(JOptionPane.showInputDialog("Please enter the month (Jan = 1, Dec = 12, etc) "));	
						
		//check input of month is valid, if it is not, print error to console
		if ((month < 1) || (month > 12)){
			System.out.println("x is negative, not cool. you entered " + month);
			System.exit(0);
		}
		
		//ask user to submit year
		int year = Integer.parseInt(JOptionPane.showInputDialog("Please enter the year in four digit format"));	
		
		//check input of year is valid, if it is not, print error to console
		if (year < 1) {
			System.out.println("year is negative, not cool. you entered " + year);
			System.exit(0);
		}		
		
		//determine if year is leap year
		boolean isLeapYear;
		
		if (year >= 1752) {
			isLeapYear = (year %4 == 0);
		}
		else {
			isLeapYear = (year %4 == 0 && year % 100 != 0) || (year % 400 == 0);
		}
		
		
	
	
		switch( month ) {
			case 1:	
				numberOfDays = 31;
				break;
		    case 2:
		    	if (isLeapYear) {
		    		numberOfDays = 29;
		    	}
		    	else {
		    		numberOfDays = 28;
		    	}
		    	break;
		    case 9:
		    	if (year == 1752) {
		    		numberOfDays = 19;
		    	}
		    	else {
		    		numberOfDays = 30;
		    	}
		        break;

		}

		

	/*
		
	
		

	/*	

1 January - 31

2 Febuary *

3 March - 31

4 April - 30

5 May - 31

6 June - 30

7 July - 31

8 August - 31

9 September - if year is 1752 then 19, else 30

10 October - 31

11 November - 30

12 December -31

*/

		

		
		JOptionPane.showMessageDialog(null, "The number of days in the month you selected is: " + numberOfDays);
		

		
				
	}
}


