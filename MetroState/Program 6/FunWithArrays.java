
// Programmer: Benjamin Crist
// Objective: Write a program that uses methods and arrays.

import javax.swing.JOptionPane;
import java.util.Arrays;

public class FunWithArrays {
	public static void main( String[] args ) {
		
		//let the user know what the program does
		JOptionPane.showMessageDialog(null, "This program will create a random array that you may search.");
		
		//Create an array of 15 random byte values
		
		byte[] myList = new byte[10];
		
		//public static byte[] createRandomArray( int s );
		
		
		
		//Print the array to the console
		//Each array element should take up 5 characters of space
		//The elements should be space-separated
		
		//public static void printArray( byte[] b )
		
		byte[] list = {3, 1, 2, 6, 4, 2};
		
			System.out.print("in main here    ");
			for (int i = 0; i < list.length; i++) {
			    System.out.print(list[i] + " ");
			}
		
		
		
		printArray(list);
		
		public static void printArray(byte[] array) {
			System.out.print("in array here    ");
			  for (int i = 0; i < array.length; i++) {
			    System.out.print(array[i] + " ");
			  }
			} 

		
		
		
		//Sort the array from least to greatest
		
		//public static byte[] sort ( byte[] b )
		
		
		
		//Print the sorted array to the console
		
		//public static void printArray( byte[] b )
		
		
		
		//Using JOptionPane, ask the user to type in a legal Byte value (-128 to +127, inclusive)

		//Using JOptionPane, tell user whether or not the value was found in the array.  
		
		//public static void find( byte[] b )
		
		//JOptionPane, ask user if they want to search for another value
		//Keep asking user if they want to search for another value until they select done, then end program
		
		
	}
}
