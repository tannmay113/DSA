public class lastoccurrence {
    public static void main(String[] args) {
        int x = 1;
        int [] arr = {1,2,3,1,3};
        int count = 0;
        for (int i = 0; i<arr.length; i++){
            if (arr[i]==x){
                count = i;
            }
//            System.out.println(arr[i]);
        }
        System.out.println(count);
    }
}
