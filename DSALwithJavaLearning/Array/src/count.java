class countX{

    void array(){
        int x = 5;
        int count = 0;
        int [] arr = {5,6,5,1,5,5,5};
        for (int i = 0 ; i<arr.length; i++){
            if (arr[i] == x){
                count++;
            }
//            System.out.println(arr[i]);
        }
        System.out.println("number of 5 present in this array = " + count);
    }
}
public class count {
    public static void main(String[] args) {

        countX count  = new countX();
        count.array();

//        int x = 5;
//        int count = 0 ;
//        int [] arr = {5,6,5,1,5,5,5};
//        for (int i = 0 ; i<arr.length; i++){
//            if (arr[i] == x){
//                count++;
//            }
////            System.out.println(arr[i]);
//        }
//        System.out.println(count);
    }
}
