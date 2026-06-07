import java.util.Scanner;

public class PrintAllPrimeNumbers {

    // question 2

//    Print all prime numbers
//      1. You've to print all prime numbers between a range
//      2. Take as nout 'low'. the lower limit of range
//      3. Take as inout 'high'. the higher limit of range
//      4. For the range print all the primes numbers between low and high (both include);
//
//     input
//          low
//          high

//output
//      n1
//      n2,
//      .... all primes b/t low and high (both included)

    public static boolean isPrime(int n){

        if (n == 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i*i <= n; i++){
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter low and high numbers");
        int low = scanner.nextInt();
        int high = scanner.nextInt();

        for (int i = low; i <= high; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
