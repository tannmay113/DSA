import java.util.Scanner;

public class problemQ1Transpose {
    static void transpose(int[][] arr , int r , int c){

        int[][] trans = new int[c][r];

        for (int i = 0; i< c ;i++){
            for (int j = 0; j< r; j++){
                trans[i][j] = arr[j][i];

            }
        }

        for (int i = 0; i<c;i++){
            for (int  j = 0; j<r;j++){
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transposeWithoutTemp(int[][] arr , int r , int c){

        for (int i = 0; i<r; i++){
            for (int  j = i ; j<c; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i= 0; i<r; i++){
            for (int j =0; j<c; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter row");
//        int r = sc.nextInt();
//        System.out.println("Enter colum");
//        int c = sc.nextInt();
//        int[][] array = new int[r][c];
//
//        for (int i= 0; i<r ; i++){
//            for (int j = 0; j<c; j++){
//                array[i][j] = sc.nextInt();
//            }
//        }
//
//        System.out.println("Entered array is :-");
//        for (int i = 0; i<r;i++){
//            for (int  j = 0; j<c;j++){
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println("Transpose array is:- ");
//        transpose(array,r,c);
//

        //Without temp;
        System.out.println("Enter row");
        int r1 = sc.nextInt();
        System.out.println("Enter colum");
        int c1 = sc.nextInt();
        int[][] array1 = new int[r1][c1];

        for (int i= 0; i<r1 ; i++){
            for (int j = 0; j<c1; j++){
                array1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Entered array is :-");
        for (int i = 0; i<r1;i++){
            for (int  j = 0; j<c1;j++){
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("transpose array is :-");
        transposeWithoutTemp(array1 , r1, c1);
    }
}