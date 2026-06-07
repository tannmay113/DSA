import java.util.Scanner;

public class Assignment2Q1 {
    static  int findRepeatingElement(int[] arr){
        for (int i = 1; i<arr.length;i++){
            for (int j = i+1; j<arr.length;j++){
                if (arr[i] == arr[j]){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int[] array = new int[n+1];
        System.out.println("Enter "+n+" numbers in array");
        for (int i = 1; i<=n; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("The first repeating element in this array is: " + findRepeatingElement(array));
    }
}
