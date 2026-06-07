import java.util.Scanner;
    class add2numbers {

        int sum(int a , int b){

            return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int x = sc.nextInt();
        int y = sc.nextInt();

        add2numbers add = new add2numbers();
        int pluse = add.sum(x,y);
        System.out.println("The add of this number is = " + pluse);
    }


}
