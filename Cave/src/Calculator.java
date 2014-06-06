import java.util.Scanner;

/**
 * A simple calculator to give practice for me to review
 * a few simple Java concepts
 */
public class Calculator {

    // create scanner object to get input
    static Scanner keyboard = new Scanner(System.in);

    /**
     * Main method to start the program.
     *
     * @param args unused default parameter
     */
    public static void main(String[] args) {
        // greet user
        System.out.println("Welcome to the calculator app\n\n");

        // infinite loop call to Menu to let user keep calculating
        // note: I provided a way to terminate program via menu so no exit condition is needed from loop
        //noinspection InfiniteLoopStatement
        for ( ; ; ) {
            Menu();
        }
    }

    /**
     * Prints a menu by calling PrintMenuChoice();
     * Prints the choice of the user and then calls method for operation user selected.
     */
    public static void Menu () {
        // I broke out the menu print statements to make this method easier to look at
        PrintMenuChoices();
        int choice = keyboard.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You want to add");
                Add();
                break;
            case 2:
                System.out.println("You want to subtract");
                Subtract();
                break;
            case 3:
                System.out.println("You want to multiply");
                Multiply();
                break;
            case 4:
                System.out.println("You want to divide");
                Divide();
                break;
            case 5:
                System.out.println("Goodbye!");
                System.exit(0);
            default:
                System.out.println("Please pick from one of the options given");
        }
    }

    /**
     * Prints the menu choices for user
     */
    public static void PrintMenuChoices() {
        System.out.println("\n\nPlease enter your choice and press enter.\n");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiple");
        System.out.println("4. Divide");
        System.out.println("5. Exit Program");
    }

    /**
     * Prompts users for 2 numbers and provides result of addition operation.
     */
    public static void Add() {
        double firstNum;
        double secondNum;
        double result;
        System.out.println("What is the first number you want to add?");
        firstNum = keyboard.nextInt();
        System.out.println("What is the second  number you want to add?");
        secondNum = keyboard.nextInt();
        result = firstNum + secondNum;
        System.out.println("The sum is: " + result);
    }
    /**
     * Prompts users for 2 numbers and provides result of subtraction operation.
     */
    public static void Subtract() {
        double firstNum;
        double secondNum;
        double result;
        System.out.println("What is the number you want to subtract from?");
        firstNum = keyboard.nextInt();
        System.out.println("What is the number you want to subtract from the first number?");
        secondNum = keyboard.nextInt();
        result = firstNum - secondNum;
        System.out.println("The difference is: " + result);
    }
    /**
     * Prompts users for 2 numbers and provides result of multiplication operation.
     */
    public static void Multiply() {
        double firstNum;
        double secondNum;
        double result;
        System.out.println("What is the first number you want to multiply?");
        firstNum = keyboard.nextInt();
        System.out.println("What is the second  number you want to multiply?");
        secondNum = keyboard.nextInt();
        result = firstNum * secondNum;
        System.out.println("The product is: " + result);
    }
    /**
     * Prompts users for 2 numbers and provides result of division operation.
     */
    public static void Divide() {
        double firstNum;
        double secondNum;
        double result;
        System.out.println("What is the number you want to divide?");
        firstNum = keyboard.nextInt();
        System.out.println("What is the number you want to divide by?");
        secondNum = keyboard.nextInt();
        result = firstNum / secondNum;
        System.out.println("The quotient is: " + result);
    }
}
