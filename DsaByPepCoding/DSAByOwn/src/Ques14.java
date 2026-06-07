public class Ques14 {

    public static int gcd(int a, int b){

        while (b != 0){

            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b){

       int lcm = (a * b) / gcd(a, b);

        return lcm;
    }

    public static void main(String[] args) {

//        14. GCD of two numbers / LCM of two numbers

        int gcd = gcd(12, 18);

        System.out.println(gcd);

        int lcm = lcm(12, 18);
        System.out.println(lcm);
    }
}
