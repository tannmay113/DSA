import java.util.Scanner;

public class multiply2arrys {

    static void print(int[][] arr){

        for (int i = 0; i< arr.length;i++){
            for (int j = 0; j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiply(int[][] a , int r1, int c1 , int[][] b, int r2, int c2){

        if (c1 != r2){
            System.out.println("multiplication is not possible in entered array");
            return;
        }

            int[][] ans = new int[r1][c2];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        ans[i][j] += (a[i][k] * b[k][j]);
                    }
                }
            }
            print(ans);
    }
    static int[][] input2DArray(int r , int c){
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[r][c];
        for (int i = 0 ; i<r ; i++){
            for (int j = 0; j<c; j++){
                array[i][j] = sc.nextInt();
            }
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // array 1
        System.out.println("enter row for array 1 ");
        int r = sc.nextInt();
        System.out.println("Enter the colum for array 1 ");
        int c = sc.nextInt();
        int[][] array = input2DArray(r,c);

        //array 2
        System.out.println("enter row for array 2 ");
        int r1 = sc.nextInt();
        System.out.println("Enter the colum for array 2 ");
        int c1 = sc.nextInt();
        int[][] array1 = input2DArray(r1,c1);

        System.out.println("Your array 1 is :- ");
        print(array);

        System.out.println("Your array 2 is :- ");
        print(array1);

        System.out.println();
        multiply(array , r , c, array1, r1, c1);

    }
}
