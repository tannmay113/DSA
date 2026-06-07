import java.util.*;

public class Ques7 {

    public static void IntersectionOfArray(int[] arr1, int[] arr2){

        Set<Integer> set = new HashSet<>();
        SortedSet<Integer> result = new TreeSet<>();

        for (int num : arr1){
            set.add(num);
        }

        for(int num : arr2){

            if(set.contains(num)){
                result.add(num);
            }
        }

        System.out.println(result);
    }

    public static List<Integer> IntersectionOfArrays(int[][] nums){

        Map<Integer, Integer> map = new HashMap<>();

        for(int[] num : nums){
            for(int val : num){
                map.put(val, map.getOrDefault(val, 0) + 1);
            }
        }

        List<Integer> result = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){

            if(entry.getValue() == nums.length){
                result.add(entry.getKey());
            }
        }

        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {

//      7. Find Intersection of Two Arrays

        int[] arr1 = {1,2,3,4,8,9};
        int[] arr2 = {3,9};
        IntersectionOfArray(arr1, arr2);


//      Find Intersection of 2D arrays
        int[][] arr = {{1,2,3,4}, {4,3,6}, {5,7,4,3}};
        List<Integer> list =  IntersectionOfArrays(arr);

        System.out.println(list);
    }
}
