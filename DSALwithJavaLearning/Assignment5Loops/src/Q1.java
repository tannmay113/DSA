//Q1 - Write a program to print Fibonacci series of n terms where n is input by user.

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 1;
        int b = 1;
        int n = sc.nextInt();
        for (int i = 0; i<n; i++){
            System.out.print(a);
            int sum = a+b;
            a = b;
            b = sum;
        }
    }
}
