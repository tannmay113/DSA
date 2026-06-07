import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length ");
        int length = sc.nextInt();
        System.out.println("Enter breath");
        int breath = sc.nextInt();
        if (length==breath){
            System.out.println("It is a square");
        }else {
            System.out.println("It is a rectangle");
        }
    }
}
