package Interfaces_8;

/**
 * @author Jakub Marciniak
 * #8
 */


interface WaterBottleInterface {
    String color = "White";
    String bottleColor = "Blue";

    void fillUp();
    void pourOut();
}

public class InterfacesRFun implements WaterBottleInterface {

    public static void main(String[] args) {

        System.out.println(color);

        InterfacesRFun IRF = new InterfacesRFun();
        IRF.fillUp();
        IRF.pourOut();

    }

    @Override
    public void fillUp() {
        System.out.println("It is filled");
    }

    @Override
    public void pourOut() {
        System.out.println(bottleColor);
    }
}


//    Notes on Interfaces:
//        Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
//        Interface methods do not have a body - the body is provided by the "implement" class
//On implementation of an interface, you must override all of its methods
//        Interface methods are by default abstract and public
//Interface attributes are by default public, static and final
//An interface cannot contain a constructor (as it cannot be used to create objects)
//        Why And When To Use Interfaces?
//        1) To achieve security - hide certain details and only show the important details of an object (interface).
//
//        2) Java does not support "multiple inheritance" (a class can only inherit from one superclass).
//        However, it can be achieved with interfaces, because the class can implement multiple interfaces.
//        Note: To implement multiple interfaces, separate them with a comma (see example below).
//
