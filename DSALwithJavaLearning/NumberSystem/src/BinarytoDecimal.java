import java.util.Scanner;

public class BinarytoDecimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ans = 0;
        int power = 1;

        for (;n>0 ;){
            int a = n%10;
            ans = (power*a)+ans ;

            n/=10;
            power*=2;
        }
        System.out.println(ans);


    }
}
