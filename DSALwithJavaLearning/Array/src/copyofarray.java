import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Arrays;

public class copyofarray {
    public static void main(String[] args) {

        int[] arr = {2,1,3,4,6,5,8,7,8};
        int[] arr_1 = Arrays.copyOf(arr, arr.length);
        System.out.print("[ ");
        for (int i = 0; i<arr_1.length; i++){
            System.out.print(arr_1[i] + " ");
        }
        System.out.print("]");

        System.out.println();

        int[] array = {2,1,3,4,6,5,8,7,8};
        int[] arr_2 = Arrays.copyOfRange(array,2, arr.length);

        for (int i = 0; i<arr_2.length; i++){
            System.out.print(arr_2[i] + " ");
        }
    }
}
