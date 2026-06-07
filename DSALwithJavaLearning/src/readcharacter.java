import java.util.Scanner;

public class readcharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word");
        String a = sc.next() ;

        System.out.println("Enter the position you want");
        char b = a.charAt(sc.nextInt());

        System.out.println(b);





    }
}
