import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name , roll number and your interest");
        String name = sc.next();
        int roll_number = sc.nextInt();
        String interest = sc.next();

        System.out.println("Name: " + name);
        System.out.println("Roll number: "+ roll_number);
        System.out.println("interest "+ interest);
    }
}
