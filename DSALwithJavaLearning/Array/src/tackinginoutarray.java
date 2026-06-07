import java.util.Scanner;

class tackinginout{

    void arry(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter " + n + " numbers");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for (int j = 0; j<arr.length;j++){
            System.out.print(arr[j] + " ");
        }
    }
}
public class tackinginoutarray {
    public static void main(String[] args) {
        tackinginout input = new tackinginout();
        input.arry();
    }
}
