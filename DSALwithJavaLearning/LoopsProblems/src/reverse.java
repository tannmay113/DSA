import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int reverse = 0;
        while(n>0){
            reverse *=10;
            reverse +=n%10;

            n/=10;
        }
        System.out.println(reverse);
    }
}
