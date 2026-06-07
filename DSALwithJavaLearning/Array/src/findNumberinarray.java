import java.util.Scanner;

class find{

    void arr(){
        Scanner sc = new Scanner(System.in);
        int [] num = {2,3,4,7,8};
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int ans = -1;
        for (int i = 0 ; i < num.length; i++){
            if(number == num[i]){
                ans = i;
            }
        }
        System.out.println(num.length);
        System.out.println(ans);
    }
}

public class findNumberinarray {
    public static void main(String[] args) {

        find ele = new find();
        ele.arr();
    }
}
