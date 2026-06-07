import java.util.Scanner;

public class checkTheNumberInArray {

    static void check(int[] arr , int[] check){
        Scanner sc = new Scanner(System.in);
        String ans = "No";
        for (int i = 0; i <= check.length ;i++){
            for (int j = 0; j< arr.length;j++) {
                if (check[i] == arr[j]) {
                    ans = "Yes";
                }
            }
            System.out.println(check[i] + " = " + ans);
            ans = "No";
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {11,22,34,5,6,6,1000,773};
        System.out.println("Enter the Check array length");
        int q = sc.nextInt();
        int[] check = new int[q];
        System.out.println("Enter " + q + " Numbers");
        for (int i = 0; i<check.length; i++){
            check[i] = sc.nextInt();
        }


        check(array, check);

    }
}
