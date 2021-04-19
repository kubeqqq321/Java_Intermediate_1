package ToString_17;

/**
 * @author Jakub Marciniak
 * #17
 */


public class Student {

    int studentId;
    String name;

    Student(int studentId , String name){
        this.studentId = studentId;
        this.name = name;
    }

    public String toString() {
        return "Student{" + "studentId=" + studentId +
                ", name='" + name + '\'' + '}';
    }
}
