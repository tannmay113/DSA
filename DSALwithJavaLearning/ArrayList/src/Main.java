import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // Tacking input by for loop
//        for (int i = 0; i<5; i++){
//            int n = sc.nextInt();
//            list.add(n);
//        }
        //Adding element by .add method
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);

        //Printing by For loop
//        for (int i = 0; i<list.size(); i++){
//            System.out.print(list.get(i) + " ");
//        }
        //Print direct
//        System.out.println(list);

        System.out.println(list.lastIndexOf(5));
        System.out.println(list.indexOf(5));

    }
}