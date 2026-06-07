class repeatingFirstValue{
    public static int repeat(int [] arr){
        for (int i = 0; i< arr.length;i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];

                }
            }
        }
        return -1;
    }
}
public class repeatingvalue {
    public static void main(String[] args) {
        int[] array = {1,2,3,3,4,5,5,6,6};
        System.out.println(repeatingFirstValue.repeat(array));
    }
}
