import java.util.Scanner;

public class IfElse2 {
    public static void main(String[] args) {

//       ~ 1. You are given as input marks of a student
//        2. Display an appropriate message based on the following rules
//        2.1 for marks above 9o, print excellent
//        2.2 for marks above 80 and less than equal to 90. print good
//        2.3 for marks above 70 and less than equal to 80. print fair
//        2.4 for marks above 60 and less than equal to 70, print meets expectations
//        2.5 for marks less than equal to 60, print below par

        Scanner scanner = new Scanner(System.in);

        int mark = scanner.nextInt();

        if (mark > 90){
            System.out.println("Excellent");
        } else if (mark > 80 && mark <= 90 ) {
            System.out.println("Good");
        }else if (mark > 70 && mark <= 80){
            System.out.println("fair");
        } else if (mark > 60 && mark <= 70) {

            System.out.println("meets expectations");
        }else {
            System.out.println("below par");
        }
    }
}
