class EvenOddBySwap{

    static int[] Swap(int[] arr , int i , int j){

        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];

        return arr;
     }

     static int[] EvenThenOddBySwap(int[] arr){

        int left = 0;
        int right = arr.length-1;

        while (left<right){

            if (arr[left]%2 != 0 && arr[right]%2 == 0){
                Swap(arr, left, right);
            }
            if (arr[left]%2 == 0){
                left++;
            }
            if (arr[right]%2 != 0){
                right--;
            }
        }
        return arr;
     }
}

public class TPQ2 {
    static int[] EvenThenOdd(int[] arr){

        int[] newArr = new int[arr.length];
        int k = 0;

        for (int i = 0; i< arr.length; i++){
            if (arr[i]%2==0){
                newArr[k++] = arr[i];
            }
        }

        for (int i = 0; i< arr.length; i++){
            if (arr[i]%2 != 0){
                newArr[k++] = arr[i];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {

        // By using temporary
        int[] array = {1,2,3,4,5,6,7,8,8,2};
        int[] ans = EvenThenOdd(array);
        for (int i = 0; i< array.length;i++){
            System.out.print(ans[i] + " ");
        }

        System.out.println(); // This is for new line

        //By using swap
        int[] array1 = {1,2,3,4,5,6,7,8,8,2};

        for (int i = 0 ; i < EvenOddBySwap.EvenThenOddBySwap(array1).length; i++){
            System.out.print(EvenOddBySwap.EvenThenOddBySwap(array1)[i] + " ");
        }

    }
}
