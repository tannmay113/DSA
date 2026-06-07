import java.util.Scanner;

public class problem3Q1 {
    static void print(int[][] arr){

        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void sumOfRectangle(int[][] arr, int l1, int r1, int l2, int r2){
        int sum = 0;
        for (int i = l1; i <= l2; i++){
            for (int j = r1; j<= r2; j++){
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }

    // method 2
    static int[][] prefixRow(int[][] arr){
        for (int i = 0 ; i<arr.length; i++){
            for (int j = 1; j<arr[i].length; j++){
                arr[i][j] = arr[i][j] + arr[i][j-1];
            }
        }
        return arr;
    }
    static void sumOfRectangleMethod2(int[][] arr, int l1, int r1, int l2, int r2){
        int[][] prefix =  prefixRow(arr) ;
        int ans = 0;
        for (int i= l1; i<=l2; i++){
                ans += prefix[i][r2]-prefix[i][r1-1];
        }
        System.out.println(ans);
    }

    //method 3
    static int[][] prefixColumn(int[][] arr){
        int[][] prefixRow = prefixRow(arr);
        for (int i = 0 ; i<prefixRow.length; i++){
            for (int j = 1; j<prefixRow[i].length; j++){
                prefixRow[i][j] = prefixRow[i][j] + prefixRow[i-1][j];
            }
        }
        return prefixRow;
    }
    static void sumOfRectangle2(int[][] arr, int l1, int r1, int l2, int r2){

        int[][] prefixRowColumn =  prefixColumn(arr) ;
        int ans = (prefixRowColumn[l2][r2] - (prefixRowColumn[l1-1][r2] + prefixRowColumn[l2][r1-1])) +
                prefixRowColumn[l1-1][r1-1];
        System.out.println(ans);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the row ");
//        int r = sc.nextInt();
//        System.out.println("Enter the colum");
//        int c = sc.nextInt();
//
//        int[][] array = new int[r][c];
//        System.out.println("Enter " + r*c + " numbers in 2D array");
//
//        for (int i = 0; i<r; i++){
//            for (int j = 0; j< c; j++){
//                array[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("Entered array is :-");
//        print(array);

        int[][] array1 = {{1,1,1,1,1,1,1},
                        {1,1,1,1,1,1,1},
                        {1,1,1,1,1,1,1},
                        {1,1,1,1,1,1,1},
                        {1,1,1,1,1,1,1},
                        {1,1,1,1,1,1,1},
                        {1,1,1,1,1,1,1}};
        System.out.println("Enter l1 and r1");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        System.out.println("Enter l2 and r2");
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

//        sumOfRectangle(array, l1,r1,l2,r2);

        //method 2
        sumOfRectangleMethod2(array1 ,l1,r1,l2,r2);

        //method 3

    }
}
