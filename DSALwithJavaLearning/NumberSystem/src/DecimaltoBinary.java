import java.util.Scanner;

public class DecimaltoBinary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int power = 1;
        int ans = 0;

        while(n>0){
            int a = n%2;
            ans = (a*power)+ans;
            n/=2;
            power*=10;
        }
        System.out.println(ans);
    }
}
