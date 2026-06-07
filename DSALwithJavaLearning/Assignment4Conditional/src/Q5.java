import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an operator: (+, -, *, or /)");
        char op = sc.next().charAt(0);;
        System.out.print("Enter first number : ");
        Double a = sc.nextDouble();
        System.out.print("Enter second number : ");
        Double b = sc.nextDouble();
        Double ans;
        switch (op) {
            case '+':
                ans = a + b;
                System.out.println(a + " + " + b + " = " + ans);
                break;
            case '-':
                ans = a - b;
                System.out.println(a + " - " + b + " = " + ans);
                break;
            case '*':
                ans = a * b;
                System.out.println(a + " * " + b + " = " + ans);
                break;
            case '/':
                ans = a / b;
                System.out.println(a + " / " + b + " = " + ans);
                break;
            default:
                System.out.println("Please enter a correct operator");
        }
    }
}
