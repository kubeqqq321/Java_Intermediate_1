package Constructors_4;

/**
 * @author Jakub Marciniak
 * #4
 */

public class Shirt {

    private static String color;
    private static char size;

    //public static String color;
    //public static char size;

    Shirt() {
    }

    Shirt(String Color, char Size) {
        color = Color;
        size = Size;

    }

    public static void putOn() {
        System.out.println("Shirts is on");
    }

    public static void takeOff() {
        System.out.println("Shirt is off");
    }

    public void setSize(char size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

//     when: [private]
//    [private] static String color ;
//    [private] static char size;

    public static char getSize() {
        return size;
    }

    public static String getColor() {
        return color;
    }
}
