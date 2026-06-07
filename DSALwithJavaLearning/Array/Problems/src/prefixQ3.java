import java.util.Arrays;
import java.util.Scanner;

    class withoutUsingExtraMemory{

        static int total(int[] arr){
            int total = 0;
            for (int i = 0; i< arr.length; i++){
                total+=arr[i];
            }
            return total;
        }
        }

public class prefixQ3 {
/*
    static void printArray(int[] arr){
        for (int i = 0 ; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static int[] prefixSum(int[] arr){
        for (int i  = 1 ; i< arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }
    static int[] suffixSum(int[] arr) {
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i] = arr[i + 1] + arr[i];
        }
        return arr;
    }

    static boolean breaking(int[] arr){
        int[] array1 = Arrays.copyOf(arr, arr.length);
        int[] prefix = prefixSum(arr);
        int[] suffix = suffixSum(array1);

        for (int i = 0; i< prefix.length-1;i++){
            for (int j = 1 ; j<suffix.length; j++) {
                if (prefix[i] == suffix[j]) {
                    return true;
                }
            }
        }
        return false;
}

 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter " + n + " numbers");
        for (int i = 0; i<n; i++){
            array[i] = sc.nextInt();
        }

//        System.out.println(breaking(array));


        //Without using extra memory

        for (int i =0 ; i< array.length;i++){

        }

    }
}
