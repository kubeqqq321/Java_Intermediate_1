package Interfaces_8;


/**
 * @author Jakub Marciniak
 * #8.2
 */

interface FirstInterface{
    void First();
}
interface SecondInterface{
    void Second();
}

public class ManyInterfaces implements FirstInterface, SecondInterface {

    public static void main(String[] args) {

        ManyInterfaces mI = new ManyInterfaces();
        mI.First();
        mI.Second();

    }

    @Override
    public void First() {
        System.out.println("Some text here....");
    }

    @Override
    public void Second() {
        System.out.println("Some more text here....");
    }
}
