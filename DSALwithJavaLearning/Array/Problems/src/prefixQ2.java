import java.util.Scanner;

public class prefixQ2 {

    static int prefixSum(int[] arr){

        Scanner sc = new Scanner(System.in);
        for (int i = 1; i< arr.length; i++){
            arr[i] = arr[i-1] + arr[i];
        }

        System.out.println("Enter how many times you want to ask the query");
        int q = sc.nextInt();
        int ans =0;
        System.out.println("Enter the value of l and r");
        for (int i =1; i<=q; i++){
            System.out.println("Enter l: ");
            int l = sc.nextInt();
            System.out.println("Enter r: ");
            int r = sc.nextInt();
            ans = arr[r] - arr[l-1];
        }
        return ans;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] array = {2,3,4,5,6,7,8,9};
//        System.out.println(prefixSum(array));

        //By 1-Based indexing
        System.out.println("Enter The length of array");
        int n = sc.nextInt();
        int[] array1 = new int[n+1];

        System.out.println("Enter " + n + " numbers");
        for (int i = 1; i <= n; i++){
            array1[i] = sc.nextInt();
        }

        System.out.println("Your answer is = " + prefixSum(array1));
    }
}
