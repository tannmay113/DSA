public class FoundationofRecursion {

    public static void print(int n){
        if(n < 1) return;

        print(n-1);
        System.out.print(n + " ");
    }

    public static void revPrint(int n){
        if(n < 1) return;
        System.out.print(n + " ");
        revPrint(n-1);
    }

    public static void printEven(int n){
        if (n < 1) return;


        printEven(n-1);
        if(n % 2 == 0){
            System.out.print(n + " ");
        }
    }

    public static void printOdd(int n){
        if (n < 1) return;


        printOdd(n-1);
        if(n % 2 != 0){
            System.out.print(n + " ");
        }
    }

    public static void printReverseTriangle(int n){

        if(n < 1) return;
        for(int i = 1; i <= n; i++){
            System.out.print("*");
        }
        System.out.println();

        printReverseTriangle(n-1);

    }

    public static int sumOfNaturalNumber(int n){

       if(n == 0) return 0;

       return n + sumOfNaturalNumber(n-1);

    }

    public static int factorial(int n){

        if(n == 0) return 1;

        return n * factorial(n-1);
    }

    public static int powerOfNumber(int num, int power){

        if(power == 0) return 1;

        return num * powerOfNumber(num, power-1);
    }

    public static int fibonacciNumber(int n){

        if(n <= 1) return n;

        return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
    }

    public static void main(String[] args) {

//      1. Print numbers from 1 to n using recursion.
        System.out.println("from 1 to n");
        print(10);

        System.out.println();
        System.out.println();

//      2. Print numbers from n to 1 using recursion.
        System.out.println("from n to 1");
        revPrint(10);

        System.out.println();
        System.out.println();

//      3. Print only even numbers from 1 to n using recursion.
        System.out.println("even number");
        printEven(10);

        System.out.println();
        System.out.println();
//      4. Print only odd numbers from 1 to n recursively.

        System.out.println("Odd number");
        printOdd(10);

        System.out.println();
        System.out.println();

//      5. Print sum of first n natural numbers recursively.

        System.out.println("Sum of first n natural");
        int n = sumOfNaturalNumber(5);
        System.out.println(n);

        System.out.println();
        System.out.println();


//      6. Print factorial of a number recursively.

        System.out.println("print factorial");
        int f  =  factorial(5);
        System.out.println(f);

        System.out.println();
        System.out.println();

//      7. Calculate power of a number (xⁿ) using recursion.
        System.out.println("calculate the power");
        int num = powerOfNumber(5, 2);
        System.out.println(num);

        System.out.println();
        System.out.println();

//      8. Find nth Fibonacci number recursively.
        System.out.println("fibonacci Number");
        int fib = fibonacciNumber(7);
        System.out.println(fib);

        System.out.println();
        System.out.println();

//      9. Print Fibonacci series up to n terms recursively.
        System.out.println("Fibonacci series");
//        FibonacciSeries(7, 0 , 1);
        int gg = 7;
        for (int i = 0; i< gg; i++){
            System.out.println(fibonacciNumber(i));
        }
//      Print reverse triangle pattern recursively.
//      System.out.println("reverse triangle pattern");
//      printReverseTriangle(5);

    }
}
