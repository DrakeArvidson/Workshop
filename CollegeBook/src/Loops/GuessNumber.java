package Loops;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        //Generate a random number to be guessed
        int number = (int)(Math.random() *101);

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");

        int guess = -1;
        while (guess != number) {
            //Prompt the user too guess the number
            System.out.print("\n Enter your guess: ");
            guess = input.nextInt();

            if (guess == number)
                System.out.print("Yes, the number is " + number);
            else if (guess > number)
                System.out.print("Your guess is too high");
            else
                System.out.println("your guess is too low");
        }
    }
}
