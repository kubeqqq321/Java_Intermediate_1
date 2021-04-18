package ObjectOrientedProgramming_2;

/**
 * @author Jakub Marciniak
 * #2
 */


public class Main {
    public static void main(String[] args) {

        OOP oop = new OOP();

        oop.click();

        System.out.println(oop.color);
        System.out.println(oop.point);
        System.out.println(oop.type);


        System.out.println(oop.clicked);

        oop.unclick();

        System.out.println(oop.clicked);

        Headphones headphones= new Headphones();

        System.out.println(headphones.color);
        headphones.volumeUp();

    }
}
