public class Ques3 {

    public static void findDuplicate(int[] arr){

        for (int i = 0; i < arr.length; i++){

            for (int j = i+1; j< arr.length; j++){

                if (arr[i] == arr[j]){
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }

    public static void removeDuplicate(int[] arr){

        int j = 0;
        for (int i = 1; i< arr.length; i++){

            if (arr[i] != arr[j]){

                j++;
                arr[j] = arr[i];
            }

        }

        // printing array
        for (int i = 0; i< j; i++){

            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {

//        3. Find Duplicate in Array / Remove duplicates from sorted array
        int[] arr = {1,2,2,4,5,4,3,6,3};
        findDuplicate(arr);
        System.out.println("=============");

        int[] array = {1,2,2,3,3,4,5,6};
        removeDuplicate(array);
    }
}
