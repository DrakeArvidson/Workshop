/**
 * Created by blarson on 2/14/14.
 */

import java.util.Scanner;
import java.util.Random;

class apples {
    public static void main (String[] args) {

        Random dice = new Random();
        int number;

        for (int counter = 1; counter <= 10; counter++) {
            number = 1 + dice.nextInt(20);
            System.out.println(number +  "  ");
        }





    }
}
