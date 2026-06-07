import java.util.Scanner;

public class weekend {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int date = sc.nextInt();

        switch (date){
            case (1) :
            System.out.println("monday");
            break;
            case (2) :
                System.out.println("Tuesday");
            break;
            case (3) :
                System.out.println("Wednesday");
                break;
            case (4) :
                System.out.println("Thusday");
                break;
            case (5) :
                System.out.println("Friday");
                break;
            case (6):
                System.out.println("Saturday");
                break;
            case (7):
                System.out.println("sunday");
            default:
                System.out.println("invalid date");
        }
    }
}
