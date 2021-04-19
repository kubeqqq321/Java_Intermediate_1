package ThisKeyword_6;

/**
 * @author Jakub Marciniak
 * #6
 */

public class ThisKeyword {

    int a;
    int b;
    public void setData1(int a, int b ){
        this.a = a;
        this.b = b;
    }

    int c;
    int d;
    public void setData2(int a, int b ){
        c = a;
        d = b;
    }

    String food;
    char size;
    public void setData3(String food , char size){
        this.food = food;
        this.size = size;

    }

    //Wrong
//    public /*static*/ void setData3(String food , char size){
//        this.food = food;
//        this.size = size;
//
//    }


    public static void main(String[] args) {

        ThisKeyword t = new ThisKeyword();

        t.setData1(4,5);
        System.out.println(t.a);
        System.out.println(t.b);

        System.out.println("----------------------");

        t.setData2(3,6);
        System.out.println(t.c);
        System.out.println(t.d);

        System.out.println("----------------------");

        t.setData3("Soup", 'L');
        System.out.println(t.food);
        System.out.println(t.size);

    }
}
