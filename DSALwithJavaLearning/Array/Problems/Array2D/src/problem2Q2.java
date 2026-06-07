import java.util.Scanner;

public class problem2Q2 {

    static void spiral(int n ) {

        int[][] array = new int[n][n];
        int top = 0, bottom = n-1, left = 0, right = n-1;

        int number = 1;
        int totalElement = 0;
        while (totalElement < n*n){

            for (int i = left; i<=right && totalElement < n*n; i++){
                array[top][i] = number++ ;
                totalElement++;
            }

            top++;

            for (int j = top; j<=bottom && totalElement < n*n; j++){
                array[j][right] = number++;
                totalElement++;
            }
            right--;

            for (int k = right; k >= left && totalElement < n*n;k--){
                array[bottom][k] = number++;
                totalElement++;
            }

            bottom--;

            for (int l = bottom; l >= top && totalElement < n*n; l--){
                array[l][left] = number++;
                totalElement++;
            }

//            number++;
            left++;
        }
        for (int i = 0; i<array.length; i++){
            for (int j= 0; j<array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        spiral(n);

    }
}
