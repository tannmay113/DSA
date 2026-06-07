public class Ques8 {

    public static void rotateRight(int[] arr, int start, int end){

       while (start < end){

           int temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;

           start++;
           end--;
       }

    }

    public static void rotateLeft(int[] arr, int start, int end){

        while (start < end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

//      8. Rotate Array by K Steps

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int k = 3;
        rotateRight(arr, 0, arr.length-1);

        rotateRight(arr, 0, k-1);
        rotateRight(arr, k, arr.length-1);

        for(int num : arr){
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println("===================");

        int[] arr1 = {9,8,7,6,5,4,3,2,1};
        int k1 = 3;
        rotateLeft(arr1, 0, arr1.length-1);
        rotateLeft(arr1, 0, arr1.length-1-k1);
        rotateLeft(arr1, arr1.length-k1, arr1.length-1);

        for(int num : arr1){
            System.out.print(num + " ");
        }
    }
}
