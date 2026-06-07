import java.util.Scanner;

class inarray{

    public static int Occurrences(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to find");
        int x = sc.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x){
                count++;
            }
        }
        return count;
    }
}
public class AssisgnmentQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Enter " + n + " numbers for array");
        for (int i = 0; i< array.length; i++){
            array[i] = sc.nextInt();
        }

        System.out.println(inarray.Occurrences(array));
    }
}
