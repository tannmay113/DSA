public class Ques13 {
    public static void main(String[] args) {

//        13. Check leap year

        int year = 2024;

        if ((year % 100 != 0 && year%4 == 0) || year%400 == 0){
            System.out.println("it is a leap year");
        }else {
            System.out.println("not a leap year");
        };
    }

}
