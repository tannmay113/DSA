import java.util.Scanner;
class diff{
    public static String difference(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X number");
       int x = sc.nextInt();
       String a = "Yes";
       String b = "No";
        for (int i = 0; i< arr.length;i++){
            for (int j = i; j< arr.length;j++){
                if (arr[i]+arr[j] == x){
                    return a;
                }
            }
        }
        return b;
    }
}
public class AssignmentQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Enter " + n + " numbers for array");
        for (int i = 0; i< array.length; i++){
            array[i] = sc.nextInt();
        }

        System.out.println(diff.difference(array));
    }
}
