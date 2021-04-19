package SuperKeyword_18;

/**
 * @author Jakub Marciniak
 * #18
 */


class Vehicle {

    int maxSpeed = 120;

    Vehicle(){
        System.out.println("We are in the [Vehicle Constructor]");
    }
    Vehicle(int maxSpeed){
        System.out.println("We are in the [Vehicle Constructor]");
        this.maxSpeed = maxSpeed;
    }

    public void vroom(){
        System.out.println("Vroom Vroom");
    }

}

class Car extends Vehicle {
    int maxSpeed = 100;

    Car(int maxSpeed){
        super();
        System.out.println("We are in the [Car Constructor]");
        this.maxSpeed = maxSpeed;
    }


    public void display(){
        System.out.println(maxSpeed);
        System.out.println(super.maxSpeed);
    }

    public void vroom(){
        System.out.println("Vroooooooom");
    }

    public void displayVroom(){
        vroom();
        super.vroom();
    }

}
