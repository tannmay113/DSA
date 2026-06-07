public class arrayReverse {

    static int[] arrayR(int [] arr){
        int [] Rarr = new int[arr.length];
        int k = 0;
        for (int i = arr.length-1; i>=0 ;i--){
            Rarr[k++] = arr[i];
        }
        return Rarr;
    }
    static void swapInArray(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]  = temp;
    }
    static int[] reverseUsingSwap(int [] arr){
        int j = arr.length-1;
        for (int i = 0; i<j ; i++ , j--){
            swapInArray(arr, i , j);
        }
        return arr;
    }

    public static void main(String[] args) {

        int [] array = {5,4,3,2,1};

        int[] ans = arrayR(array);
        System.out.println("Reverse array is");
        for (int i = 0; i< ans.length; i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println();

        int [] arry = {5,4,3,2,1};
        reverseUsingSwap(arry);
        System.out.println("reverse array by swap");
        for (int i = 0; i<array.length; i++){
            System.out.print(arry[i] + " ");
        }
    }
}
