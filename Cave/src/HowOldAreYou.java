/**
 * Created by blarson on 2/14/14.
 *
 * Program to get age in years from user and convert to seconds.
 * Of course, this will only be accurate to the nearest year, but it's a fun program anyway.
 */

import java.util.Scanner;

public class HowOldAreYou {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your age in years: ");
        int ageYears = keyboard.nextInt();

        int ageMonths = ageYears * 24;
        int ageWeeks = ageYears * 52;
        int ageDays = ageYears * 365; //if we were going to be accurate, we'd calculate leap-year, but we aren't going to worry about that
        int ageHours = ageDays * 24;
        int ageMinutes = ageHours * 60;
        int ageSeconds = ageMinutes * 60;

        System.out.println("You said your are " + ageYears + " years old. This means you are: ");
        System.out.println("Months old: " + ageMonths);
        System.out.println("Weeks old: " + ageWeeks);
        System.out.println("Days old: " + ageDays);
        System.out.println("Hours old: " + ageHours);
        System.out.println("Minutes old: " + ageMinutes);
        System.out.println("Seconds old: " + ageSeconds);

    }
}
