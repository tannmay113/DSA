import java.util.Scanner;

public class greaterThenX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = {2,34,5,3,3,5,6,7,1};
        int X = 3;

        for (int i = 1; i<arr.length; i++){
            if (arr[i] > X){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
