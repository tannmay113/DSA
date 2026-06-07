import java.util.Scanner;

public class simpelinterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a amount");
        int amount = sc.nextInt();

        System.out.println("Enter time");
        int time = sc.nextInt();

        int r = 10;

        int si = (amount*time*r)/100;

        System.out.println(si);



    }
}
