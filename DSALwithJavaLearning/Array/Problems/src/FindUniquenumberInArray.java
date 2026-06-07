class uniqueNumber{
    public static void unique(int[] arr){
        int ans = 0;
        for (int i = 0; i< arr.length; i++){
            for (int j = i+1; j<arr.length; j++){
                if (arr[i] == arr[j]){
                    arr[i] = arr[j] = -1;
                }
            }
        }
        for (int k = 0; k<arr.length; k++){
            if (arr[k] != -1){
                System.out.print(arr[k]);
            }
        }
    }
}
public class FindUniquenumberInArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,4,5,6,7,3,2,1};
        uniqueNumber.unique(array);
    }
}
