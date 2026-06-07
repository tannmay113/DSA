import java.util.Scanner;

public class Adding2arrays {
//    Scanner sc = new Scanner(System.in);
//    static void Adding2DArrays(int[][] a, int[][] b){
//
//        for (int i = 0; i<a.length ; i++){
//            for (int j = 0; j<b.length;j++){
//
//            }
//        }
//    }

    static int[][] tackingInput(int r , int c){
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[r][c];
        for (int i = 0; i<r ; i++){
            for (int j = 0; j<c; j++){
                array[i][j] = sc.nextInt();
            }
        }
        return array;
    }

    static void adding(int[][] a , int c, int[][] b,  int c1){
        if(a.length != b.length || c1 != c1){
            System.out.println("Incorrect Array Provided addition not possible");
            return;
        }

        int[][] sum = new int[a.length][c];
        for (int i = 0; i<a.length;i++){
            for (int j = 0; j<c;j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("sum of array1 and array2 is :- " );
        print(sum);
    }
    static int[][] print(int[][] arr){

        for (int i = 0; i< arr.length;i++){
            for (int  j = 0; j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return arr;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Array 1
        System.out.println("Enter rows for array 1 :- ");
        int r = sc.nextInt();
        System.out.println("Enter column for array 1 :-");
        int c = sc.nextInt();
        System.out.println("Enter " + r + " and " + c + " numbers of 2DArray in array 1");
        int [][] array = tackingInput(r,c);


        //array 2
        System.out.println("Enter rows for array 2 :- ");
        int r1 = sc.nextInt();
        System.out.println("Enter column for array 2 :-");
        int c1 = sc.nextInt();
        System.out.println("Enter " + r1 + " and " + c1 + " numbers of 2DArray in array 2");
        int [][] array1 = tackingInput(r1,c1);

        System.out.println("Your array 1 is :- ");
        print(array);
        System.out.println("Your array 2 is :- ");
        print(array1);

        adding(array , c, array1 , c1);
    }
}
