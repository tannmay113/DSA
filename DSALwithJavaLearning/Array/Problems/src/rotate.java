import java.util.Scanner;

public class rotate {
        static int[] rotateAnArray(int[] arr){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of k");
            int k = sc.nextInt();
            if (k > arr.length){
                k = k % arr.length;
            }

            int [] Rarr = new int[arr.length];
            int j= 0;
            for (int i = arr.length-k; i < arr.length ;i++){
                Rarr[j++] = arr[i];
            }
            for (int n = 0; n < arr.length-k ; n++){
                Rarr[j++] = arr[n];
            }
            return Rarr;
        }

    static int[] reverse(int[]arr , int i , int j) {
        while (i < j) {
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];

            i++;
            j--;
        }
        return arr;
    }
    static void rotateGivenArray(int[]arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter K = ");
        int k = sc.nextInt();
        k = k% arr.length;

        reverse(arr , 0 , arr.length-k-1);
        reverse(arr , arr.length-k , arr.length-1);
        reverse(arr , 0 , arr.length-1);

        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1,2,3,4,5};
//        int[] ans = rotateAnArray(array);
//
//        for (int i = 0; i< ans.length;i++){
//            System.out.print(ans[i]);
//        }

        rotateGivenArray(array);

    }
}
