// Assignment 5 - Program to learn methods by making a tip calculator
 // Programmer: Benjamin Crist
//TODO: make this a non-Jpane program and see if repackaging jar still works

//importing swing
import javax.swing.JOptionPane;

public class centimetersToInches {
	public static void main (String [] args) {
		
		//declaring the variable needed for later output, this is declared as a double for greater precision in the calculation
		double calculatedInch;
		//asks a user to input an integer (type int)		
		int measurementCent = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of Centimeters, in whole numbers only: "));	
		
		//convert this number of centimeters into a number of inches
		calculatedInch = measurementCent / 2.54;
		
		//rounding the measurement to the nearest number of inches
		int roundedInch = (int)Math.round(calculatedInch);
		
		//converting inches into inches and feet
		int measurementFeet = roundedInch / 12;
		int measurementRemainingInch = roundedInch % 12;
		
		//outputting the inches and feet to the user
		JOptionPane.showMessageDialog(null, measurementCent + " centimenters equals " + measurementFeet + " feet " + measurementRemainingInch + " inches");
        //System.out.println(null, measurementCent + " centimenters equals " + measurementFeet + " feet " + measurementRemainingInch + " inches");

    }
}
