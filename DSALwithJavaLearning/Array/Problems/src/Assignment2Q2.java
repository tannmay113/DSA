public class Assignment2Q2 {

    static int arrangeInAlternate(int[] arr){

        int j = 0;
        int k = 0 ;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > k){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        for (int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        return j;
    }

    static int[] rearrange(int[] arr){

        int r = arrangeInAlternate(arr);
        for (int i = 0; (r < arr.length && i < r); r++, i+=2) {
            int temp = arr[i];
            arr[i] = arr[r];
            arr[r] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {

        int[] array = {-5,-2,5,2,4,7,1,8,0,-8};
        int[] array1 = {1,2,3,-4,-1,4};
        int[] array2 = {1,2,3,-4};
        int[] ans = rearrange(array1);

        System.out.println();
        for (int i = 0; i<ans.length;i++){
            System.out.print(ans[i] + " ");
        }





    }
}
