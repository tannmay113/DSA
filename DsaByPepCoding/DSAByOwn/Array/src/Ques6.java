import java.util.Arrays;
import java.util.Collections;

public class Ques6 {

    public static int KthLargestNumber(int[] arr, int k){

        Arrays.sort(arr);

        return arr[arr.length-k];
    }

    public static void main(String[] args) {

//        6. Find Kth Largest Element
//        int[] arr = {1,5,4,3,8,5};
        int[] arr = {3,2,1,5,6,4,7};
        int k = 2;
        int n = KthLargestNumber(arr, k);
        System.out.println(n);
    }
}
