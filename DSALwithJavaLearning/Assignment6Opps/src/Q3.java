import java.util.Scanner;

//Q3. Write a program to print the area of a rectangle by creating a class named 'Area' taking the values
//        of its length and breadth as parameters of its constructor and having a method named 'returnArea'
//        which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
class Area{

    int length;
    int breath;
    public Area(int length, int breath){
        this.length = length;
        this.breath = breath;
    }

    void returnArea(){
        int area = length*breath;
        System.out.println("Area of rectangle is: " + area);
    }
}
public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        int length = sc.nextInt();
        System.out.println("Enter breath");
        int breath = sc.nextInt();
        Area obj = new Area(length, breath);

        obj.returnArea();
    }
}