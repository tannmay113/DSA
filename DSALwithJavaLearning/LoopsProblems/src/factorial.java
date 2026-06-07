import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente a number");
        int n = sc.nextInt();
        int i = 1;
        int factorel = 1;
//        while (i<=n){
//            factorel*=i;
//            i++;
//        }
//        System.out.println(factorel);

        for (;i<=n;i++){
            factorel*=i;
        }
        System.out.println(factorel);

    }
}
