/**
 * Created by blarson on 2/14/14.
 */

import java.util.Scanner;

class apples {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int grade;
        int average;
        int counter = 0;

        while (counter < 10) {
            grade = input.nextInt();
            total = total + grade;
            counter++;
        }


    }
}
