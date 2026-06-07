import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (int num = sc.nextInt(); num>=1; num--){
            System.out.println(num);
            sum += num;
        }
        System.out.println("sum of these number is : " + sum);

    }
}
