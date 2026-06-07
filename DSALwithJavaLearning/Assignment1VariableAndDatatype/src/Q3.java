import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the length of rectangle ");
        int length = sc.nextInt();
        System.out.println("Enter the breath of rectangle ");
        int breath = sc.nextInt();

        int area = length * breath;
        System.out.println("The area of rectangle is:- " + area);
    }
}
