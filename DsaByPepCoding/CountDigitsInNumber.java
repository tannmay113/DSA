import java.util.Scanner;

public class CountDigitsInNumber {
    public static void main(String[] args) {

//        ----------------- you have to count the number of digits in a number ---------------------

        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        int count = 0;
//        while (num != 0){
//
//             num =  num / 10;
//
//             count ++;
//        }
//        System.out.println(count);

        // ------------------ you have to print digits of a number from right to left ------------------------------

//        int number = scanner.nextInt();
//        int k = 0;
//        while (number != 0){
//
//            k = number % 10;
//            System.out.println(k);
//            number = number / 10;
//        }



        // ------------------- you have to print digits of a number from left to right ----------------------------
        int number = scanner.nextInt();
        int temp = number;
        int count = 0;
        while (temp != 0){
            temp = temp/10;
            count++;

        }
        
        int div = (int)Math.pow(10, count-1);
        while (div != 0){
            int j = number / div;
            System.out.println(j);
            number = number % div;
            div = div / 10;
        }
    }
}
