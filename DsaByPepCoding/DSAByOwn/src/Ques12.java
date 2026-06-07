public class Ques12 {


    public static void SimpleNumber(int num){

        for (int i = 1; i<= num; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void sameNumberTriangle(int num){

        for (int i = 1; i<= num; i++){

            for (int j = 1; j <= i; j++){

                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void continuousNumber(int num){

        int count = 1;
        for (int i = 1; i<num; i++){

            for (int j = 1; j <= i; j++){

                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }

    public static void reverseNumber(int num){

        for (int i = 1; i <= num; i++){
            int k = i;
            for (int j = 1; j <= i; j++){
                System.out.print(k--);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

//        12. Number pattern

//        1. Simple Number Triangle
//                    1
//                    12
//                    123
//                    1234
//                    12345


//        2. Same Number Triangle
//                    1
//                    22
//                    333
//                    4444
//                    55555

//        3. Continuous Number Pattern   (Floyd’s triangle)

//                    1
//                    2 3
//                    4 5 6
//                    7 8 9 10


//        4. Reverse Number Pattern

//                    1
//                    21
//                    321
//                    4321
//                    54321

//        5. Pyramid Number Pattern

//                    1
//                    121
//                    12321
//                    1234321
//                    123454321


        SimpleNumber(5);

        System.out.println("------------------------------------------------------");
        sameNumberTriangle(5);

        System.out.println("--------------------------------------------------------");
        continuousNumber(5);

        System.out.println("-------------------------reverseNumber-------------------------------");
        reverseNumber(5);
    }

}
