import java.util.Scanner;

public class IsAPrimeNumber {

    public static boolean isPrime(int n){

        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return  false;

        for (int i = 3; i * i <= n; i++){
            if (n % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {

//        question 1
//                1. You've to check weather a given number is prime of not
//                2. Take a number T as input representation count of input numbers to be tested.
//                3. Take a number N as input T number of times
//                4. For each inout value of N . print 'prime' if the number is prime and 'not prime' () -> otherwise

//        input format
//                A number t
//                A number n
//                A number n
//                .... t number of times
//
//        output format
//                prime
//                not prime
//                ...t number of times


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter T");
        int t = sc.nextInt();

        for (int i = 0; i < t ; i++){
            System.out.println("Enter n");
            int n = sc.nextInt();

            if (isPrime(n)){
                System.out.println("Prime");
            }else {
                System.out.println("not prime");
            }
        }

        sc.close();
    }

}
