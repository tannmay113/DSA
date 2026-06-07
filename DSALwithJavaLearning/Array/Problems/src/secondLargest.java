import java.util.Arrays;

class dusraBda{
    public static int largest(int[] arr) {
        int array = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > array) {
                array = arr[i];
            }
        }
        return array;
    }
         static int sec_Largest(int[] arr) {
             int array = largest(arr);

             for (int i = 0; i < arr.length; i++) {
                 if (arr[i] == array) {
                     arr[i] = Integer.MIN_VALUE;
                 }
             }
             int secondlargest = largest(arr);
             return secondlargest;
         }
}
public class secondLargest {
    public static void main(String[] args) {

        int [] arry = {1,4,3,4,7,6,7,8};
        System.out.println(dusraBda.sec_Largest(arry));

    }
}
