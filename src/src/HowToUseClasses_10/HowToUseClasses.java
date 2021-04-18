package HowToUseClasses_10;

/**
 * @author Jakub Marciniak
 * #10
 */

public class HowToUseClasses {
    public static void main(String[] args) {

        Class1 c = new Class1();
        System.out.println(c.x);
        System.out.println(c.chars);
        c.printHi();

        System.out.println("-------------------------------");

        Class1 d = new Class1();
        System.out.println(d.x);
        System.out.println(d.chars);
        d.printHi();

        System.out.println("-------------------------------");

        Class2 c2 = new Class2();
        System.out.println(c2.y);
        System.out.println(c2.isValid("isValid"));


    }
}
