package FinalKeyword_12;

/**
 * @author Jakub Marciniak
 * #12
 */

public class FinalKey {

    final int MIN = 0;
    final int MAX = 5;
    //final int MAX;
    static final double PI = 3.14159;

//    FinalKey(){
//        MAX = 5;
//    }

//    void changeMAX(int NewMAX){
//        MAX = NewMAX;
//    }

    final public void sayHi() {
        System.out.println("Hi");
    }


    public static void main(String[] args) {

//        final int i = 0;
//        i = 4;

        FinalKey f = new FinalKey();
        System.out.println(f.MAX);
        f.sayHi();
    }
}


class OtherClass extends FinalKey{

//    public void sayHi(){
//        System.out.println("Hello");
//    }

}
//You can't change anything with the final key in front of it
//Variables , Methods, Class