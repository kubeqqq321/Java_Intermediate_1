package ObjectOrientedProgramming_2;

/**
 * @author Jakub Marciniak
 * #2
 */


public class Headphones {

    String charge = "USB type C";
    public String[] controls = {"power","volume","skip","play/pause"};
    public String color = "Blue/Black";

    static boolean power = false;
    static int volume = 0;

    public static void powerOn(){
        power = true;
    }
    public static void powerOff(){
        power = false;
    }


    public static void volumeUp(){
        volume++;
    }
    public static void volumeDown(){
        volume--;
    }




}
