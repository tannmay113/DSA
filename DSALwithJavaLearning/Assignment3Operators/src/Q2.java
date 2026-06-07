import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Entered value of a is: " + a);
        System.out.println("Entered value of b is: " + b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println();

        System.out.println("value of a after swap is: " + a);
        System.out.println("Value of b after swap is: " + b);


    }
}
