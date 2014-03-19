/**
 * Created by blarson on 2/14/14.
 *
 * This file keeps changing based on the New Boston Java tutorials on YouTube
 */

class apples {


    public static void main (String[] args) {

        System.out.println(average(43,56,76,8,65,76,2,31));






    }


    public static int average (int...numbers) {
        int total = 0;
        for (int x : numbers)
            total += x;
        return total/ numbers.length;
    }



}
