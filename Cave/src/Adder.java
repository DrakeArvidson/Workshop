/******************************************************************************
 *                       COPYRIGHT 2002 - 2012 BY DELL INC.
 *                          ALL RIGHTS RESERVED
 *
 * THIS DOCUMENT OR ANY PART OF THIS DOCUMENT MAY NOT BE REPRODUCED WITHOUT
 * WRITTEN PERMISSION FROM DELL INC.
 *****************************************************************************/

import java.util.Scanner;

/**
 * @author blarson
 */
public class Adder {


    /**
     * @args command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to the calculator");
        System.out.println("Please enter first number to add: ");
        int num1 = keyboard.nextInt();
        System.out.println("Please enter the second number to add: ");
        int num2 = keyboard.nextInt();
        int total = num1 + num2;
        System.out.println("\nYour total is: " + total);



    }

}
