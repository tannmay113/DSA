import java.util.Scanner;

public class problemQ3Paascaltriangle {

    static void pascal(int r){

        int[][] ans = new int[r][];
        for (int i = 0; i<r; i++){
            ans[i] = new int[i+1];
            ans[i][0] = ans[i][i] = 1;
            for (int j = 1; j<i; j++){
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }

        for (int i = 0; i<ans.length;i++){
            for (int j =0; j<ans[i].length; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pascal(n);

    }
}
