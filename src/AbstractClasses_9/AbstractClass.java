package AbstractClasses_9;

/**
 * @author Jakub Marciniak
 * #9
 */


abstract class Dog {

    public void bark() {
        System.out.println("Bark!");
    }

    public abstract void poop();

}

class Chihuahua extends Dog {
    public void poop() {
        System.out.println("Dog pooped!");
    }

}

interface DogInterface {

    void bark();

    void poop();
}


public class AbstractClass implements DogInterface {

    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.bark();


        System.out.println("------------Abstract class---------------");
        Chihuahua c = new Chihuahua();
        c.bark();
        c.poop();
        System.out.println("------------Interface---------------");
        AbstractClass a = new AbstractClass();
        a.bark();
        a.poop();

    }


    //interface
    @Override
    public void bark() {
        System.out.println("Bark!");
    }

    @Override
    public void poop() {
        System.out.println("Pooped!");
    }
}
