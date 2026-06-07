import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;
        int num1 = 1;
        while (num1<=num){
            System.out.println(num1);
            sum +=num1;
            num1++;
        }
        System.out.println("sum of all number is : " + sum);
    }
}
