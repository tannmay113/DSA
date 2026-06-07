public class Ques6 {

    public static void sum(int num){
        int sum = 0;
        while (num > 0){
            int n = num%10;
            sum = sum+ n;
            num = num/10;
        }
        System.out.println(sum);
    }

    public static void count(int num){
        int count = 0;
        while (num > 0){
            count++;
            num = num/10;
        }

        System.out.println(count);
    }
    public static void main(String[] args) {

//        6. Sum of digits  /  Count digits in a number

        sum(123);
        count(12343);
    }
}
