package Constructors_4;

/**
 * @author Jakub Marciniak
 * #4
 */

public class Constructors {
    public static void main(String[] args) {

        Shirt shirt = new Shirt();
        shirt.setColor("Blue");
        shirt.setSize('M');
        shirt.putOn();
        System.out.println(Shirt.getColor() + " , " + Shirt.getColor());


        Shirt shirt1 = new Shirt("Red", 'L');
        System.out.println(shirt1.getColor() + " , " + shirt1.getSize());
    }
}
