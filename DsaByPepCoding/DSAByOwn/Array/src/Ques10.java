import java.util.HashMap;
import java.util.Map;

public class Ques10 {


    public static void fistWay(int[] arr, int sum) {

        Map<Integer, Integer> map = new HashMap<>();

        int start = 0;
        int end = -1;
        int curr = 0;

        for (int i = 0; i < arr.length; i++) {

            curr += arr[i];

            if (curr == sum) {
                end = i;
                break;
            }

            if (map.containsKey(curr - sum)) {
                start = map.get(curr - sum) + 1;
                end = i;
                break;
            }

            map.put(curr, i);
        }

        if (end == -1) {
            System.out.println("not found");
        } else {
            for (int i = start; i <= end; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void thirdWay(int[] arr){

        int start = 0;
        int end = 0;
        int currentSum = 0;
        int max = 0;

        for (int i = 0; i< arr.length; i++){

            currentSum += arr[i];

            if(currentSum > max){
                max = currentSum;
                end = i;
            }

            if (currentSum < 0){
                start = i+1;
                currentSum = 0;
            }
        }

        for(int i = start; i<= end; i++){
            System.out.print(arr[i] + " ");
        }

//        System.out.println(max);

    }

    public static void fifthWay(int[] arr, int sum){
        Map<Integer, Integer> map = new HashMap<>();
        int currSum = 0;
        int count = 0;
        map.put(0, 1);
        for(int i = 0; i < arr.length; i++){

           currSum += arr[i];

           if(map.containsKey(currSum - sum)){
               count += map.get(currSum -sum);
           }

           map.put(currSum,  map.getOrDefault(currSum, 0) + 1);
        }

        System.out.println(count);
    }

    public static void main(String[] args) {

//        Find Sub-array with Given Sum
//        Count Sub-arrays with Sum = K
//        Maximum Sub-array Sum (Kadane 🔥)


//        All Ways They Can Ask to Find Sub-array
//
//        1. Subarray with Given Sum (Positive Numbers)
//        2. Subarray with Given Sum (With Negatives)
//        3. Maximum Subarray Sum (Kadane 🔥)
//        4. Minimum Subarray Sum
//        5. Count Subarrays with Sum = K (LC 560 🔥)
//        6. Longest Subarray with Sum = K
//        7. Subarray Sum Divisible by K
//        8. Print All Subarrays
//        9. Subarray Product < K
//        10. Maximum Circular Subarray Sum



//        int[] arr = {1,2,6,3,5,1,7,8,2,9};
        int[] arr = {10, 15, -5, 15, -10, 5};
        int sum = 5;

        fistWay(arr, sum);

        System.out.println();

        thirdWay(arr);

        System.out.println();

        fifthWay(arr, sum);
    }
}
