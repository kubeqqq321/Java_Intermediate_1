package Inheritance_3;

/**
 * @author Jakub Marciniak
 * #3
 */


public class Main {
    public static void main(String[] args) {

        Mouse1 m1 = new Mouse1();
        Mouse2 m2 = new Mouse2();
        Mouse3 m3 = new Mouse3();


        System.out.println("---------m1.----------");
        m1.scrollUp();
        m1.scrollDown();
        m1.rightClick();
        m1.leftClick();
        m1.setColor("Yellow/Black");

        System.out.println("---------m2.----------");
        m2.scrollUp();
        m2.scrollDown();
        m2.rightClick();
        m2.leftClick();
        m2.connect();

        System.out.println("---------m3.----------");
        m3.scrollUp();
        m3.scrollDown();
        m3.rightClick();
        m3.leftClick();

        System.out.println("---------Mouse1.----------");
        Mouse1.scrollUp();
        Mouse1.scrollDown();
        Mouse1.rightClick();
        Mouse1.leftClick();
        Mouse1.setColor("Yellow/Black");

        System.out.println("---------Mouse2.----------");
        Mouse2.scrollUp();
        Mouse2.scrollDown();
        Mouse2.rightClick();
        Mouse2.leftClick();
        Mouse2.connect();

        System.out.println("---------Mouse3.----------");
        Mouse3.scrollUp();
        Mouse3.scrollDown();
        Mouse3.rightClick();
        Mouse3.leftClick();




    }

}
