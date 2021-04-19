package SubClassAndSuperClass_13;

/**
 * @author Jakub Marciniak
 * #13
 */

public class Main {
    public static void main(String[] args) {

        Walking w = new Walking(true , "Nike" , 10.0);
        System.out.println(w.goreTex);

        Running r = new Running(4.5 , "Adidas" , 8.5);
        System.out.println(r.weight);
    }

}
