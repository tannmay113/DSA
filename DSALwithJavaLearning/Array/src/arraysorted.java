import java.util.Scanner;
class sorted {
    static boolean arr(int[] arrry) {
        boolean check = true;
        for (int i = 1; i < arrry.length; i++) {
            if (arrry[i] < arrry[i-1]) {
                check = false;
                break;
            }
//            return check;
        }
        return check;
    }
}
public class arraysorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        sorted obj = new sorted();
        System.out.println("Enter length of array");

        int n = sc.nextInt();
        int [] arrr = new int[n];

        System.out.println("Enter " + n + " numbers");

         for(int i = 0 ; i<arrr.length; i++) {
             arrr[i] = sc.nextInt();
         }
        System.out.println(sorted.arr(arrr));
    }
}
