import java.util.Scanner;

//Q4. Print the sum, difference and product of two complex numbers by creating a class named
//'Complex' with separate methods for each operation whose real and imaginary parts are
//        entered by user.
class complex{
    int x , y;

    void sum(){
        int sum = x+y;
        System.out.println("The sum of " + x +" and " + y  + " is: " + sum);
    }

    void product(){
        int pro = x*y;

        System.out.println("The product of " + x +" and " + y  + " is: " + pro);
    }

    void diff(){
        int sub = x-y;
        System.out.println("The difference of " + x +" and " + y  + " is: " + sub);

    }
}
public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        complex obj = new complex();
        System.out.println("Enter first value");
        obj.x = sc.nextInt();
        System.out.println("Enter second value");
        obj.y = sc.nextInt();

        obj.diff();
        obj.sum();
        obj.product();
    }
}
