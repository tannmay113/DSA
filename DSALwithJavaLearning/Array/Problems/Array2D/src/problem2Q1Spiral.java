import java.util.Scanner;
public class problem2Q1Spiral {

    static void spiral(int[][] arr , int r, int c){
        int topRow = 0 , bottom_row = r-1 , right_colum = c-1, left_colum = 0;

        int totalElement = 0;

        while (totalElement < r*c){

            for (int i = left_colum; i<=right_colum && totalElement < r*c; i++){
                System.out.print(arr[topRow][i] + " ");
                totalElement++;
            }

            topRow++;

            for (int j = topRow; j<=bottom_row && totalElement < r*c; j++){
                System.out.print(arr[j][right_colum] + " ");
                totalElement++;
            }
            right_colum--;

            for (int k = right_colum; k >= left_colum && totalElement < r*c;k--){
                System.out.print(arr[bottom_row][k] + " ");
                totalElement++;
            }

            bottom_row--;

            for (int l = bottom_row; l >= topRow && totalElement < r*c; l--){
                System.out.print(arr[l][left_colum] + " ");
                totalElement++;
            }

            left_colum++;
        }

//        for (int i = 0; i<r; i++){
//            for (int j = 0; j<c ; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row ");
        int r = sc.nextInt();
        System.out.println("Enter colum");
        int c = sc.nextInt();

        System.out.println("ENTER " + r*c + " numbers of elements");
        int[][] array = new int[r][c];

        for (int i = 0 ; i<r; i++){
            for (int j = 0; j<c; j++){
                array[i][j] = sc.nextInt();
            }
        }
        spiral(array,r, c);


    }
}
