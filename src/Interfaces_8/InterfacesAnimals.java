package Interfaces_8;

/**
 * @author Jakub Marciniak
 * #8.1
 */

interface Animal{
    void sleep();
    void animalSound();
}

public class InterfacesAnimals implements Animal {

    @Override
    public void sleep() {
        System.out.println("Zzzzz");
    }

    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }


    public static void main(String[] args) {

        InterfacesAnimals animals = new InterfacesAnimals();
        animals.animalSound();
        animals.sleep();

    }


}
