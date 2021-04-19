package InnerClasses_21;

/**
 * @author Jakub Marciniak
 * #21
 */

class Outside {
    int a = 0;
        //normal
     class Inside{
         int b= 5;
     }
//     private class Inside{
//         int b= 5;
//     }

//    static class Inside {
//        int b = 5;
//    }

}

public class InnerStellar {
    public static void main(String[] args) {

        //normal
        Outside o = new Outside();
        Outside.Inside i = o.new Inside();
        System.out.println(o.a + ", " + i.b);

        //static works good don't worry
//        Outside.Inside i = new Outside.Inside();
//        System.out.println(i.a + ", " + i.b);

    }
}
