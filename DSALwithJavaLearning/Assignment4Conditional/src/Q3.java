import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price");
        int CP = sc.nextInt();
        System.out.println("Enter selling price");
        int SP = sc.nextInt();

        if (CP < SP){
            int profit = SP-CP;
            System.out.println("Profit = " + profit);
        }else {
            int Loss = CP-SP;
            System.out.println("Loss = " + Loss);
        }
    }
}
