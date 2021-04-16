package Recursion_1;

/**
 * @author Jakub Marciniak
 * #1
 */

public class Recursion {
    public static void main(String[] args) {

        //sayHi(4);
        //countBackwards(4);
        counting(4);


    }

    public static void sayHi(int times) {
        if (times == 0) {
            System.out.println("Done!");
        } else {
            System.out.println("hi");
            times--;
            sayHi(times);
        }
    }

    public static void countBackwards(int back) {
        if (back == 0) {
            System.out.println("Done!");
        } else {
            System.out.println(back);
            back--;
            countBackwards(back);
        }
    }

    public static int counting(int count){

        if(count == 0){
            System.out.println("Done");
        }
        else{
            System.out.println("Is:"+ count);
            count--;
            counting(count);
        }
        return 0;
    }






}
