import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 subjects numbers");
         int subject1 = sc.nextInt();
        int subject2 = sc.nextInt();
        int subject3 = sc.nextInt();

        int totalMarks = subject1+subject2+subject3;
        int percentage = (totalMarks/3);
        System.out.println("total marks of 3 subject is 300 and student obtain " + totalMarks);
        System.out.println("percentage of student is: " + percentage + "%");
    }
}
