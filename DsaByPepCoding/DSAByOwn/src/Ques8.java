public class Ques8 {

    public static void armStrong(int num){

        int count = 0;

        int copyNum = num;

        while (copyNum > 0){

            count++;
            copyNum = copyNum/10;
        }

        copyNum = num;

        int sum = 0;
        while (copyNum > 0){

            int digit = copyNum%10;

            int multiple = (int)Math.pow(digit, count);

            sum +=multiple;

            copyNum = copyNum/10;
        }

        if (sum == num){
            System.out.println("armString number");
        }else {
            System.out.println("opps!!");
        }
    }
    public static void main(String[] args) {

//        8. Check Armstrong number

        armStrong(153);
    }
}
