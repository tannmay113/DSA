//Q2. Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
//        creating a class named 'Triangle' without any parameter in its constructor.
class Triangle{
    int x , y , z;

     void getArea(){
        double Area = (x+y+z)/2;
         System.out.println("Area of triangle is : " + Area);
    }
    void parameter(){
         int p = x+y+z;
        System.out.println("Parameter of triangle is: " + p);
    }
}
public class Q2 {
    public static void main(String[] args) {

        Triangle obj = new Triangle();
        obj.x = 3;
        obj.y = 4;
        obj.z = 5;

        obj.getArea();
        obj.parameter();

    }
}
