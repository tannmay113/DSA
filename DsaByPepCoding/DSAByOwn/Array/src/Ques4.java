public class Ques4 {

    public static int[] merge(int[] arr1, int[] arr2){

        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0 , j = 0 , k = 0;

        while (i < arr1.length && j < arr2.length){

            if (arr1[i] <= arr2[j]){
                arr3[k] = arr2[i];
                i++;
            } else {
                arr3[k] = arr1[j];
                j++;
            }
            k++;

        }

        while (i < arr1.length){
            arr3[k] = arr1[i];
            k++;
            i++;
        }

        while (j < arr2.length){
            arr3[k] = arr2[j];
            k++;
            j++;
        }


        return arr3;

    }
    public static void main(String[] args) {

//       4. Merge Two Sorted Arrays
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};

       int[] result =  merge(arr1, arr2);

       for (int i = 0; i< result.length; i++){
           System.out.print(result[i] + " ");
       }
    }
}
