package InstanceOf_20;

/**
 * @author Jakub Marciniak
 * #20
 */

class Bird {
    public void sing() {
    System.out.println("Singing!");
    }
}

class Eagle extends Bird {

}

interface Bird1{
    public void sing(); //{
//        System.out.println("Singing!");
//    }
}

class Eagle1 implements Bird1{

    @Override
    public void sing() {
        System.out.println("Singing Eagle1");
    }
}



public class MyObjects {

    public static void main(String[] args) {

        MyObjects o = new MyObjects();
        System.out.println(o instanceof MyObjects);
        //calss subclass or interface

        Eagle e = new Eagle();
        System.out.println(e instanceof Bird);

        Eagle e1 = null;
        System.out.println(e1 instanceof Bird);

        Eagle e2 = new Eagle();
        System.out.println(e2 instanceof Bird);

    }

}
