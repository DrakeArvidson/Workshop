/**
 * Created by blarson on 2/14/14.
 */
import java.util.Scanner;

public class apples {
    public static void main (String[] args) {

        Scanner keyboard = new Scanner(System.in);

        tuna tunaObject = new tuna();

        int x = 1;

        while (x !=0 ) {

            System.out.print("Press 0 to exit, any other key to continue: ");
            x = keyboard.nextInt();
            keyboard.nextLine(); //needs to be called so the next Scanner nextLine call works

            System.out.println("Enter name of first gf here:");
            String temp = keyboard.nextLine();
            tunaObject.setName(temp);
            tunaObject.saying();
        }
    }
}
