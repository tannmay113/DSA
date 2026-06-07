//Q1. Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign
//        the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
class Student{
    String Name;
    int RollNo;
}
public class Q1 {
    public static void main(String[] args) {

        Student obj = new Student();
        obj.Name = "John";
        obj.RollNo = 2;

        System.out.println("Name of student s is: " + obj.Name + " and roll number is: " + obj.RollNo);
    }
}
