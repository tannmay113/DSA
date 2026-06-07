public class Ques7 {
    public static void main(String[] args) {
//        7. Swap two numbers without third variable

        int a = 7;
        int b = 20;

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(b + " " + a);
    }
}
