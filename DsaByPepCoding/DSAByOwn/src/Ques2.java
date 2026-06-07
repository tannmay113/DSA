public class Ques2 {

    public static void allPalindromes(int n){

        for(int i = 1; i <= n; i++){
            int k = i;
            int j = 0;
            while ( k > 0){

                int num = k%10;
                j = (j*10) + num;
                k = k/10;
            }
            if( j == i){
                System.out.print(i + " ");
            }
        }
    }

    public static void checkingPalindromeNumber(int n){
//        Check Number is Palindrome
        int num = n;
        int reverse = 0;
        while (num > 0){
            int digit = num%10;
            reverse = reverse *10  + digit;
            num = num/10;
        }

        if (reverse == n){
            System.out.println("its palindrome");
        }else {
            System.out.println("nooooot a palindrome !! ");
        }

    }
    public static void main(String[] args) {
//        2. Find All Palindrome Numbers (1–100)

        allPalindromes(100);
        System.out.println();
        checkingPalindromeNumber(100);
    }
}
