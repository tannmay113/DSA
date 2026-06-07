import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 integer values");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = a*b;
        System.out.println("Multiple of " + a + " and " + b + " is:- " + c);
    }
}
