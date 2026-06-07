class SortZerosAndOnesBySwap {

    static int[] swap(int[] arr, int i, int j) {

            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];

        return arr;
    }

    static int[] sortarr(int[] arr){

        int left = 0;
        int right = arr.length-1;

        while(left < right){

            if (arr[left] == 1 && arr[right] == 0){
                swap(arr , right, left);

                left++;
                right--;
            }
            if (arr[left] == 0){
                left++;
            }
            if (arr[right] == 1){
                right--;
            }
        }
        return arr;
    }

}
public class TPQ1 {

    static int[] sort(int[] arr){
        int [] arr1 = new int[arr.length];
        int k = 0;
        for (int i = 0; i<arr.length ;i++) {
            if (arr[i] == 0) {
                arr1[k++] = arr[i];
            }
        }
        for (int i = 0; i < arr.length;i++){
            if (arr[i] == 1){
                arr1[k++] = arr[i];
            }
        }
        return arr1;
    }


    static void sortZerosAnsOnes(int[] arr){
        int Zeros = 0;
        for (int i  = 0; i< arr.length; i++){
            if (arr[i] == 0){
                Zeros++;
            }
        }

        for (int i = 0; i< arr.length;i++){

            if (i < Zeros){
                arr[i] = 0;
            }else {
                arr[i] = 1;
            }
        }

        for (int i = 0 ; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {

        // Sort by using Temporary array
        int[] array = {1,0,1,0,0,0,1,0,1,0};

        int[] ans = sort(array);

        for (int i = 0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }

        System.out.println(); //  This for the next line

        // sort by using Count
        int[] array1 = {1,0,1,0,0,0,1,0,1,0};
        sortZerosAnsOnes(array1);

        System.out.println(); // This for the next line

        // sort by using Swap Method
        int[] array2 = {1,0,1,0,0,0,1,0,1,0};
       int[] ans1 =  SortZerosAndOnesBySwap.sortarr(array2);

       for (int i = 0 ; i<ans1.length; i++){
           System.out.print(ans1[i] + " ");
       }
    }
}
