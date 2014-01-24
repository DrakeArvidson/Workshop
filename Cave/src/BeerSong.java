
public class BeerSong {
  public static void main (String[] args) {
    //we are creating a var named beerNum
	  int beerNum = 99;
	  //we created a String named "word"
	  String word = "bottles";

	  while (beerNum > 0) {

		  if (beerNum == 1) {
			  word = "bottle"; //singular, as in ONE bottle
		  }

		  System.out.println(beerNum + " " + word + " of beer on the wall");
	
	  }
	}
}

