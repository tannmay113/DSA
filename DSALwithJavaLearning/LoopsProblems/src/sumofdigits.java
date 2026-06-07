import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


//        int n = sc.nextInt();
//        int num = n;
//        int sum = 0;
//        int count = 0;
//        for (; num>0; sum+=num%10 , num/=10 , count++){
//
//        }
//        System.out.println("the sum of " + n + "= " + sum + " and the length of this number is = " + count);


        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        while (n>0){

            sum+=n%10;
            n/=10;
            count++;
        }
        System.out.println(sum);
    }
}
