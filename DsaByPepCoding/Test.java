import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int temp = num;
        int count = 0;
        while (temp != 0){
            temp = temp/10;
            count++;
        }

        int div = (int)Math.pow(10, count-1);
        while (num != 0){
            int n = num/div;

            System.out.println(n);
            num %= div;

            div /= 10;

        }

    }
}
