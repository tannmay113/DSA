import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 1; i<=t ; i++){
            int fistNumber = sc.nextInt();
            int secondNumber = sc.nextInt();
            System.out.println(fistNumber+secondNumber);
        }
    }
}
