class arrs{

    void array(){
        int []arr = {1,5,3,7};
        int ans = 0;
        for(int i = 0; i<arr.length; i++){
            if (arr[i]>ans){
                ans = arr[i];
            }
//            System.out.println(arr[i]);
        }
        System.out.println(ans);
    }

}
public class calculatelargenumberinarray {
    public static void main(String[] args) {
        arrs large = new arrs();
        large.array();
    }
}
