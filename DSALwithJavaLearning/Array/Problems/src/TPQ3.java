import java.util.Arrays;

public class TPQ3 {
    public static void main(String[] args) {

        int[] array = {-3,-1,2,4,5,7,9};

        for (int i = 0; i< array.length; i++){
            array[i] *= array[i];
        }

        Arrays.sort(array);

        for (int i = 0 ; i<array.length; i++){
            System.out.print(array[i] + " ");
        }

    }
}
