public class Ques9 {
    public static void main(String[] args) {

//        9. Move Zeroes to End

        int[] arr = {0,2,0,1,0,4,5,0,6,7,8,0,9,0};
        int k = 0;
        for(int num : arr){

            if(num != 0){
                arr[k] = num;
                k++;
            }
        }

        for(int i = k; i<arr.length; i++){
            arr[i] = 0;
        }

        for(int n : arr){
            System.out.print(n + " ");
        }
    }
}
