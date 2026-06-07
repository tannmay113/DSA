import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        //Adding elements
        System.out.println("Enter ArrayList:- ");
        for (int i = 0; i<5; i++){
            int n = sc.nextInt();
            list.add(n);
        }
        //Printing element
//        System.out.println("Entered ArrayList is:- ");
//        for (int i = 0; i<list.size(); i++){
//            System.out.print(list.get(i) + " ");
//        }
//
//        System.out.println();

        //Printing in reverse
//        System.out.println("ArrayList after reverse");
//        for (int i = list.size()-1; i>=0 ; i--){
//            System.out.print(list.get(i) + " ");
//        }
//
//        int j = list.size()-1;
//        for (int i = 0; i<j; i++){
//            Integer temp = list.get(i);
//            list.set(i, list.get(j));
//            list.set (j, temp);
//            j--;
//        }
//
//        System.out.print(list + " ");


         List<List<Integer>> t = new ArrayList();
         t.add(Arrays.asList(1));
        System.out.println(t);

    }
}
