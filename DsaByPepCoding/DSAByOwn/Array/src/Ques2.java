public class Ques2 {

    public static int maximumElement(int[] arr){

        int max = arr[0];

        for (int i = 0; i< arr.length; i++){

            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static int minimumElement(int[] arr){

        int min = arr[0];

        for (int i = 0; i< arr.length; i++){

            if (min > arr[i]){
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {

//        2. Find the Maximum Element in an Array    / Find max & min in array
                int[] arr = {1,2,45,55,3,2,5};

       int max =  maximumElement(arr);
        System.out.println(max);

        int min = minimumElement(arr);
        System.out.println(min);
    }
}
