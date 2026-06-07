import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {

        // You've to print first n fibonacci numbers.
//        Take as input 'n' the count of fibonacci numbers to print.
//                print first n fibonacci numbers.
//
//        input
//              n
//
//        output
//                        0
//                        1
//                        1-->     1 + 0
//                        2-->     1 + 1
//                        3-->     1 + 2

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 0; i<=n; i++){
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
            int x = 10;
        }
    }
}
