/**
 * Created by blarson on 2/14/14.
 */



class apples {
    public static void main (String[] args) {
        int bucky[]={3,4,5,6,7};
        int total = 0;
        int altTotal = 0;

        for(int x: bucky) {
            total += x;
        }

        System.out.println("total is: " + total);


        for (int counter = 0; counter < bucky.length; counter ++ ) {
            altTotal = altTotal + bucky[counter];
            //altTotal += bucky[counter];
        }

        System.out.println("altTotal is: " + altTotal);


    }
}
