import java.util.Scanner;

public class ReverseEachRow {

    static void swap(int[] arr){
        int x = 0;
        int y = arr.length-1;
        while (x<y){
            arr[x] =  arr[x] + arr[y];
            arr[y] = arr[x] - arr[y];
            arr[x] = arr[x] - arr[y];
            x++;
            y--;
        }
    }
    static int[][] reverseRow(int[][] arr){

        for (int i = 0; i<arr.length; i++){
            swap(arr[i]);
        }
        return arr;
    }

    static void print(int[][] arr){

        for (int i = 0; i< arr.length;i++){
            for (int j = 0; j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row:- ");
        int r = sc.nextInt();
        System.out.println("Enter colum:- ");
        int c = sc.nextInt();

        int[][] array = new int[r][c];

        System.out.println("Enter 2D  array");
        for (int i = 0; i<r; i++){
            for (int j = 0; j<c; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        print(reverseRow(array));

    }
}
