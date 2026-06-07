import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int digit = sc.nextInt();
        int temp = digit;
        int sum = 0;
        while(temp>0){
            sum += temp%10;
            temp = temp/10;
        }
        System.out.println("Sum of " + digit +  " is: " + sum);
    }
}
