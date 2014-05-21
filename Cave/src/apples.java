///**
// * Created by blarson on 2/14/14.
// *
// * This file keeps changing based on the New Boston Java tutorials on YouTube
// */
//

import java.util.Scanner;

class apples {
    public static void main(String args[]){

        Scanner bucky = new Scanner(System.in);
        double fnum, snum, answer;
        System.out.println("Enter first num: ");
        fnum = bucky.nextDouble();
        System.out.println("Enter second num: ");
        snum = bucky.nextDouble();

        System.out.println("Would you like to add or subtract?");
        System.out.println("Enter 1 for add, 2 for subtract and press enter.");
        int choice = bucky.nextInt();

        if (choice == 1) {
            answer = fnum + snum;
            System.out.println("The sum is: " + answer);
        }
        else if (choice == 2) {
            answer = fnum - snum;
            System.out.println("The difference is: " + answer);
        }
        else  {
            System.out.println("Invalid selection...exiting program");
        }








    }
}


