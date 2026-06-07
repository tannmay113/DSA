public class prefixQ1 {

    static void printArray(int[] arr){

        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static int[] prefixSum(int[] arr){

        int[] ans = new int[arr.length];
        ans[0] = arr[0];
        for (int i = 1; i< arr.length;i++){
                ans[i] = ans[i-1] + arr[i];
        }
        return ans;
    }

    static void prefixSumWithoutTemp(int[] arr){

        for (int i = 1; i< arr.length; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        printArray(arr);

    }
    public static void main(String[] args) {

        int[] array = {2,3,4,5,6,7};

        int[] ans = prefixSum(array);
        printArray(ans);

        System.out.println(); // This is for new line

        //Without using temporary
        int[] array1 = {2,3,4,5,6,7};
        prefixSumWithoutTemp(array1);

    }
}
