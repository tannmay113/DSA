public class Ques5 {

    public static void checkPrime(int n){

        if (n == 1 || n == 0){
            System.out.println("not a prime number");
        }

        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                System.out.println("not a prime number");
            }
        }
        System.out.println("prime number");
    }

    // printing all prime number till n
    public static void printPrimeNumber(int n){

        if( n == 1 || n == 0){
            System.out.println("not a prime number");
        }

        for (int i = 2; i <= n; i++){
            boolean flag = true;
            for (int j = 2; j <= i/2 ; j++){
                if(i%j == 0){
                    flag = false;
                    break;
                }
            }

            if (flag){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
//        5. Prime number check / print all prime number till n

        checkPrime(2);

        printPrimeNumber(100);
    }
}
