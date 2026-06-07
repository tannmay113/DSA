public class swap {
    public static void main(String[] args) {
    /*
        int a = 9;
        int b = 5;

        int A = b;
        int B = a;

        a = A;
        b = B;

        System.out.println("a : "  + a);
        System.out.println("b : " + b);
  */
        //Swap without temp

        int a = 9;
        int b = 5;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }
}
