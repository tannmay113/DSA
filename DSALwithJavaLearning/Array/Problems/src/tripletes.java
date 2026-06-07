class tripletesSum{
    public static int tripelsum(int[] arr){
        int x = 12;
        int count = 0 ;

        for (int i = 0; i< arr.length; i++){
            for (int j = i+1; j< arr.length;j++ ){
                for (int k = j+1; k< arr.length;k++){
                    if (arr[i] + arr[j] + arr[k] == x){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
public class tripletes {
    public static void main(String[] args) {
        int[] array = {1,4,5,6,3};
//        tripletesSum obj = new tripletesSum();
        System.out.println(tripletesSum.tripelsum(array));
    }
}