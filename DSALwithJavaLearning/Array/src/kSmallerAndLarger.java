import java.util.*;
import java.util.Scanner;

class kthNumber{

    static int[] smaller(int[] arr){
        Arrays.sort(arr);
//        for (int i = 0 ; i<arr.length; i++) {
//            System.out.print(arr[i]);
//        }
        return arr;
    }

//    static int[] larger(int[] arry){
//        Arrays.sort(arry, Collections.reverseOrder());
//        return arry;
//    }


}
public class kSmallerAndLarger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,1,3,4,6,5,8,7};
        System.out.println("Enter kth number for smaller value you want");
        int k = sc.nextInt();
        System.out.println("Enter Lth number for largest value you want");
        int L = sc.nextInt();

        int [] array = kthNumber.smaller(arr);
//        int [] arry = kthNumber.larger(arr);

        System.out.println("The smallest number is = " + array[k-1]);
        System.out.println("The largest number is = " + array[array.length-L]);

    }
}
