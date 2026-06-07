import java.util.Scanner;

public class ProblemQ2clockWise90Degree {

    static int[][] transpose(int[][] arr, int r, int c){

        for (int i =0; i<r;i++){
            for (int j = i; j<c; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
    }

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

    static void reverseRow(int[][] arr){

        for (int i = 0; i<arr.length; i++){
            swap(arr[i]);
        }

        for (int i = 0; i< arr.length;i++){
            for (int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row");
        int r = sc.nextInt();
        System.out.println("Enter colum");
        int c = sc.nextInt();
        int[][] array = new int[r][c];

        for (int i= 0; i<r ; i++){
            for (int j = 0; j<c; j++){
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("Entered array is :-");
        for (int i = 0; i<r;i++){
            for (int  j = 0; j<c;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int[][] trans = transpose(array , r , c);
        System.out.println("after 90 degree clock wise then the array is:- ");
        reverseRow(trans);
    }
}
