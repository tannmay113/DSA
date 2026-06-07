import java.util.Scanner;

public class agedivision {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");

        int a = sc.nextInt();
        if(a<=12){
            System.out.println("Child");

        }else if (a>12 && a<=18){
            System.out.println("Teeanger");
        }else {
            System.out.println("you are adlt");
        }

    }
}
