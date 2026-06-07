import java.util.Scanner;

class missingNumber{

    public static int missing(int[] arr){
        int total = 0;
        for (int i = 0; i< arr.length; i++){
            total += arr[i];
        }
        return total;
    }
}
public class AssisgnmentQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int N = n-1;
        int[] array = new int[N];

        System.out.println("Enter " + N + " numbers for array");
        for (int i = 0; i< array.length; i++){
            array[i] = sc.nextInt();
        }

        int mainTotal = (n*(n+1))/2;
        int total = missingNumber.missing(array);

        int ans = mainTotal-total;
        System.out.println("The missing number in this array is = " + ans);
    }
}
