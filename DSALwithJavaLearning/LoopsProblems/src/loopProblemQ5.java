import java.util.Scanner;

public class loopProblemQ5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int count = 1;

        for (int i = 1 ; i<=r ; i++){
            for (int j = 1 ; j<=r-i ; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= count; k++){
                    System.out.print("*");
            }
            count+=2;
            System.out.println();
        }


    }
}
