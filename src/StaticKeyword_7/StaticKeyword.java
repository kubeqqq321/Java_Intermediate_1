package StaticKeyword_7;

/**
 * @author Jakub Marciniak
 * #7
 */

public class StaticKeyword {

    int a1 = 0;
    static int a2 = 4;

    public static void main(String[] args) {

        int b = 1;

        System.out.println(b);
        //System.out.println(a1); // Wrong
        System.out.println(a2);

        StaticKeyword s = new StaticKeyword();
        System.out.println(s.a1);




    }
}
