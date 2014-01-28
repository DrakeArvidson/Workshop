/**
 * Created by blarson on 1/28/14.
 * This is a modification of BeerSong.java to match lyrics listed here:
 * http://www.99-bottles-of-beer.net/lyrics.html
 * This makes it easier to match an expected output
 */
public class BeerSongAlternate {
    public static void main (String[] args) {
        //we are creating a var named beerNum
        int beerNum = 99;
        //we created a String named "word"
        String word = "bottles";

        System.out.println("\n\n");

        while (beerNum > 0) {

            System.out.println(beerNum + " "+ word + " of beer on the wall, " + beerNum + " " + word + " of beer.");

            beerNum = beerNum - 1;

            if (beerNum == 1) {
                word = "bottle"; //singular, as in ONE bottle
            }

            if (beerNum > 0) {
                System.out.println("Take one down and pass it around, " + beerNum + " " + word + " of beer on the wall.\n");
            }
            else {
                System.out.println("Take one down and pass it around, no more bottles of beer on the wall.\n");
            }



        } //end while loop

        if (beerNum > 0 ) {
            System.out.println(beerNum + " " + word + " of beer on the wall");
        }
        else {
            System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
            System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
        } //end else
        System.out.println("\n\n");

    } //end main method
}//class

