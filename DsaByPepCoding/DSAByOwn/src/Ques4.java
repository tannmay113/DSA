public class Ques4 {

    public static  void factorial(int n)
    {
        int sum = 1;
        while (n > 0){
            sum = sum * n;
            n--;
        }

        System.out.println(sum);
    }

    // by using recursion

    public  static int findFactorial(int n){

        if (n == 0 || n == 1){
            return 1;
        }

        return n * findFactorial(n-1);
    }
    public static void main(String[] args) {

//        4. Find factorial (loop & recursion)
//        factorial(5);

        System.out.println(findFactorial(5));;
    }
}
