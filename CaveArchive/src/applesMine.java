/* playing with the lesson with my own program */


public class applesMine {

    // write code for phone notification quiet during hours of 10pm to 6am, hours will be in miltary time to make things easy
    // 6am is 6 and 10pm is 20
    public static void main(String[] args) {
        int hour = 0;


        while (hour < 24) {
            System.out.println("Hour is: " + hour + " NotificationSounds are one: " + NotificationSoundOn(hour));
            hour ++;
        }
    }

    public static boolean NotificationSoundOn (int h) {
        if (h < 6 || h > 20 ) {
            return false;
        }
        else {
            return true;
        }
    }

}
