package Encapsulations_11;

/**
 * @author Jakub Marciniak
 * #11
 */

public class Main {

    public static void main(String[] args) {
        Student s = new Student();
        s.name1 = "Tommy";
        s.age1 = 21;

        System.out.println(s.name1+ ", "+s.age1);

        s.setName("Suzie");
        s.setAge(23);

        System.out.println(s.getName()+", "+s.getAge());



    }
}
