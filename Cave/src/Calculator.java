/******************************************************************************
 *                       COPYRIGHT 2002 - 2012 BY DELL INC.
 *                          ALL RIGHTS RESERVED
 *
 * THIS DOCUMENT OR ANY PART OF THIS DOCUMENT MAY NOT BE REPRODUCED WITHOUT
 * WRITTEN PERMISSION FROM DELL INC.
 *****************************************************************************/

import java.util.Scanner;

/**
 * @author Stark
 */
public class Calculator {

    /**
     * @args command line arguments
     */
    public static void main(String[] args) {
        // greet user
        System.out.println("Welcome to the calculator app\n\n");
        // create scanner object to get input
        Scanner keyboard = new Scanner(System.in);

        Menu();
        int choice = keyboard.nextInt();

        switch (choice);
        Menu();
        System.out.println();



        // TODO: add in function for each option
        // TODO: add remainder option
        // TODO: add in looping and exit feature


    }

    public static void  Menu () {
        System.out.println("Please enter your choice and press enter.\n");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiple");
        System.out.println("4. Divide");
    }

}
