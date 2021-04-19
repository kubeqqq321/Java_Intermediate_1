package Polimorphism_22;

/**
 * @author Jakub Marciniak
 * #22
 */

class Bird{

    public void sing(){
        System.out.println("tweet tweet tweet");
    }

}

class Robin extends Bird{
    public void sing(){
        System.out.println("Robin tweet tweet");
    }

}

class Pelican extends Bird{
    public void sing(){
        System.out.println("Pelican tweet tweet");
    }

}


public class Poli {

    public static void main(String[] args) {

        Bird b = new Bird();
        b.sing();

        Robin r = new Robin();
        r.sing();

        Pelican p =new Pelican();
        p.sing();

    }
}
