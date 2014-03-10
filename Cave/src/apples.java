/**
 * Created by blarson on 2/14/14.
 */

import java.util.Random;

class apples {
    public static void main (String[] args) {
        //creating random generator object and array object
        Random rand = new Random();
        int frequency[]=new int [7];

        //roll dice 1000 times, increase each index 1-6 when that value is generated
        for (int roll = 1; roll < 1000; roll++) {
            ++frequency[1+rand.nextInt(6)];
        }

        //print header for table
        System.out.println("Face\tFrequency");

        //print values for entire array, excluding first element since 0 can't be rolled on a die
        for (int face = 1; face < frequency.length ; face++){
            System.out.println(face + "\t\t" + frequency[face]);
        }
    }
}
