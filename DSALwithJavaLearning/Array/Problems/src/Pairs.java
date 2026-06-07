public class Pairs {
        public static void main(String[] args) {

            int[] arr = {1,2,3,4,5,6,7,8,9};
            int count = 0;
            int x = 9;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i; j < arr.length; j++) {
                    if (arr[i] + arr[j] == x) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
