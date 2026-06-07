import java.util.Scanner;

public class constructor {
    int a;
    int b;
   constructor(int x , int y){
        a = x;
        b = y;
    }
    int sum (){
        return a+b;
    }
    int sub(){
        return a-b;
    }
    int multi(){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int x = sc.nextInt();
        int y = sc.nextInt();

        constructor add = new constructor(x,y);
        int pluse = add.sum();
        int multiply = add.multi();
        int subs = add.sub();
        System.out.println("The add of this number is = " + pluse);
        System.out.println("The multiply of this number is = " + multiply);
        System.out.println("The subs of this number is = " + subs);
    }
}
