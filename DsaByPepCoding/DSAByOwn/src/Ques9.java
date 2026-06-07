public class Ques9 {
    public static void main(String[] args) {

//        9. Find largest of three numbers

        int a = 60;
        int b = 30;
        int c = 50;

        if(b > a && b > c){
            System.out.println("largest number is :- " + b);
        } else if (c > a && c > b) {
            System.out.println("largest number is :- " + c);
        }else {
            System.out.println("largest number is :- " + a);
        }
    }
}
