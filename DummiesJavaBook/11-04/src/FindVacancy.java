import static java.lang.System.out;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

class FindVacancy {

    public static void main(String args[])
                                  throws IOException {


        Scanner keyboard = new Scanner(System.in);

        String curDir = System.getProperty("user.dir");
        File GuestList = new File("DummiesJavaBook/11-04/GuestList.txt");
        System.out.println("Current sys dir: " + curDir);
        System.out.println("Current abs dir: " + GuestList.getAbsolutePath());

        Scanner diskScanner =
            new Scanner(new File("DummiesJavaBook/11-04/GuestList.txt"));
        int guests[] = new int[10];
        int roomNum;

        for (roomNum = 0; roomNum < 10; roomNum++) {
            guests[roomNum] = diskScanner.nextInt();
        }

        roomNum = 0;
        while (roomNum < 10 && guests[roomNum] != 0) {
            roomNum++;
        }

        if (roomNum == 10) {
            out.println("Sorry, no v cancy");
        } else {
            out.print("How many people for room ");
            out.print(roomNum);
            out.print("? ");
            guests[roomNum] = keyboard.nextInt();

            PrintStream listOut =
                new PrintStream("11-04/GuestList.txt");

            for (roomNum = 0; roomNum < 10; roomNum++) {
                listOut.print(guests[roomNum]);
                listOut.print(" ");
            }
        }
    }
}
