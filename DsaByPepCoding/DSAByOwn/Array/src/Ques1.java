public class Ques1 {

    public static void main(String[] args) {

//        1. Reverse an Array

        int [] array = {1,2,3,4,5};
        int len = array.length-1;
        for (int i = 0; i< array.length/2; i++){

            int temp = array[i];
            array[i] = array[len];
            array[len] = temp;
            len--;

        }

        for (int i = 0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
