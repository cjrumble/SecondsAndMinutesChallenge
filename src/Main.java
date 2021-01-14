/* ***************************************************************************
This is a comment about the MAIN program.
*************************************************************************** */

public class Main {
    public static void main(String[] args) {
        int userMinutes = 123;
        int seconds = 55;
        getDurationString(userMinutes, seconds);
    }
//
        public static void getDurationString(int userMinutes, int seconds) {
            if ((userMinutes < 0) || (seconds < 0 || seconds > 59))
                System.out.println("Invalid parameters!");
            else {
            int hours = (userMinutes / 60);
            int minutes = (userMinutes % 60);

            System.out.println(hours + "h " + minutes + "m " + seconds + "s");
        }
   }
}
