class arr{
    void sumofarr() {

        int[] arrs = {1, 5, 3,7};
        int ans = 0;
        for (int i = 0; i < arrs.length ; i++) {
            ans = arrs[i]+ans;
//            System.out.println(arrs[i]);
        }
        System.out.println(ans);
    }
}
public class sumofarray {
    public static void main(String[] args) {
        arr array = new arr();
        array.sumofarr();
    }
}
