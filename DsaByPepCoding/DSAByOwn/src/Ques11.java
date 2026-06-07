public class Ques11 {
    public static void main(String[] args) {

//        11. Pyramid pattern

        int num = 10;

        for (int i = 1; i < num; i++){

            for (int j = 1; j <= num-i; j++) {

                System.out.print(" ");
            }

            for (int k = 1; k <= 2*i-1; k++){
                System.out.print("*");
            }

            System.out.println();
        }


//        Diamond pattern


        System.out.println("-----------------------------------Diamond pattern-------------------------------------");

        int n = 5;

        for (int i = 1; i<= n; i++){

            for (int j = 1; j<= n-i; j++){

                System.out.print(" ");
            }

            for (int k = 1; k<= 2*i-1; k++){
                System.out.print("*");
            }

            System.out.println();
        }

//        (second half)
        for (int i = n-1; i >= 1; i--){

            for (int j = 1; j<= n-i; j++){

                System.out.print(" ");
            }

            for (int k = 1; k<= 2*i-1; k++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
