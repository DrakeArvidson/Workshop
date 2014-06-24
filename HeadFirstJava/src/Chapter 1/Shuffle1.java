/**
 * Created by blarson on 1/29/14.
 *
 * This class has 7 blocks of code that need to be arranged in order to form a program
 * with expected output of:
 * a-b  c-d
 *
 * I put //MagBlock in front of each second of code and white space to indicate the blocks
 */

//MagBlock
public class Shuffle1 {
    public static void main (String [] args) {

        //MagBlock
        int x = 3;

        //MagBlock
        if (x > 2) {
            System.out.print("a");
        }

        //MagBlock
        while (x > 0) {

            //MagBlock
            x = x - 1;
            System.out.print("-");

            //MagBlock
            if (x == 2) {
                System.out.print("b c");
            }

            //MagBlock
            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            }
        }

    }

}
