public class NumberBasedRecursive {

    public static int countDigits(int n, int count){

        if(n == 0) return (count == 0) ? 1 : count;

        count++;
        return countDigits( n/10, count);
    }

    public static int Reverse(int n, int rev){

        if(n  == 0) return rev;

        rev  *= 10 ;

        return Reverse(n/10,rev + n%10);

    }

    public static int ProductOfDigits(int n, int pro){

        if(n == 0) return pro;

        int val = n%10;

        return ProductOfDigits(n/10, pro * val);
    }

    public static int HcfOfTwoNumber(int a, int b){
        if(b == 0) return a;

        return HcfOfTwoNumber(b, a % b);
    }

    public static void numberInWords(int n){
        if(n == 0) return;
        numberInWords(n/10);
        int m = n %10;
        if(m == 0){
            System.out.println("Zero");
        }else if(m == 1){
            System.out.println("one");
        }else if(m == 2){
            System.out.println("two");
        }else if(m == 3){
            System.out.println("Three");
        }else if(m == 4){
            System.out.println("Four");
        }else if(m == 5){
            System.out.println("Five");
        }else if(m == 6){
            System.out.println("Six");
        }else if(m == 7){
            System.out.println("Seven");
        }else if(m == 8){
            System.out.println("Eight");
        }else if(m == 9) {
            System.out.println("Nine");
        }

    }

    public static int SumOfEven(int n, int sum){

        if (n == 0) return sum;
        int val = 0;
        if(n%2 == 0){
            val = n;
        }
        return SumOfEven(n-1, sum+val);
    }
    public static void main(String[] args) {

//      1. Count the number of digits in a number recursively.
        System.out.println("digits count");
        int count = 0;
        System.out.println(countDigits(12312356, count));

        System.out.println();
        System.out.println();
//        2. Reverse a number recursively.
        System.out.println("reverse");
        System.out.println(Reverse(123, 0));

        System.out.println();
        System.out.println();
//      3. Check if a number is a palindrome using recursion.
        System.out.println("palindrome");
        int n = 121;
        int rev = Reverse(n , 0);
        if(rev == n ){
            System.out.println("yes");
        }

        System.out.println();
        System.out.println();
//       4. Find product of digits of a number recursively.
        System.out.println("product of digits");
        int val = ProductOfDigits(223, 1);
        System.out.println(val);

        System.out.println();
        System.out.println();

//      5.  Find GCD (HCF) of two numbers using Euclid’s algorithm recursively.
        System.out.println("HCF of two numbers");
        int a = HcfOfTwoNumber(48, 18);
        System.out.println(a);

        System.out.println();
        System.out.println();
//      7. Print digits of a number in words recursively (e.g., 123 → “one two three”).
        System.out.println("number in words");
        numberInWords(123);

        System.out.println();
        System.out.println();

//        8. Calculate the sum of first n even numbers recursively.
        System.out.println("Sum of even numbers");
        int sum = SumOfEven(10, 0);
        System.out.println(sum);
    }
}
