public class Ques1 {

    public static void fibonacci(int n){

        int first = 0, second = 1;
        while (n>=0){

            System.out.print(first + " ");
            int next = second + first;
            first = second;
            second = next;
            n--;
        }
    }

    public static int recursionFibonacci(int n){

        if(n <= 1){
            return n;
        }

        return recursionFibonacci(n-1) + recursionFibonacci(n-2);
    }

    public static void printFibonacci(int n, int a, int b){
        if(n == 0){
            return;
        }
        System.out.print(a + " ");
        printFibonacci(n-1, b, a+b);
    }

    public static void printTillN(int n , int a, int b){

        if (a > n){
            return;
        }

        System.out.print(a + " ");

        printTillN(n, b , a+b);
    }

    public static void main(String[] args) {

//        1. Fibonacci Using Recursion

            fibonacci(10);
            System.out.println();
//        recursionFibonacci(10);

        printFibonacci(9, 0, 1);
        System.out.println();
        printTillN(10, 0 , 1);
    }
}
