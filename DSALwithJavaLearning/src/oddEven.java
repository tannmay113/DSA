import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");

        int num = sc.nextInt();

        if(num==0){
            System.out.println("Your number is ZERO this is not even or odd");

        }else if (num%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("odd");
        }
    }
}
