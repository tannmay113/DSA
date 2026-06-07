import com.sun.source.tree.ContinueTree;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int integer = sc.nextInt();

        if (integer >= 0){
            System.out.println("You entered a positive number");
        }else {
            System.out.println("You entered a negative number that's why it is skipped");
        }

    }
}
