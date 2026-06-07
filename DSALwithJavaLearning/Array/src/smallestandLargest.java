import java.util.Arrays;
import java.util.Scanner;

class bigandsmall{

    static int[] arr(int[] array){
            Arrays.sort(array);

            for (int i = 0 ; i<array.length; i++){
                System.out.print(array[i] + " ");
            }
        System.out.println();
            return array;
        }


    }
public class smallestandLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arry = {1,2,3,5,4,5};

        int[] a  = bigandsmall.arr(arry);

        System.out.println("The smallest number in this array is = " + a[0]);
        System.out.println("The larger numebr in this  array is = " + a[a.length-1]);
    }
}
