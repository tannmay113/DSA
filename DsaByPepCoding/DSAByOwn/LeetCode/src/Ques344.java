public class Ques344 {


    static class Solution{

        public static void reverseString(char[] s){

            int j = s.length-1;

            for(int i = 0; i< s.length/2; i++){

                char temp = s[i];
                s[i] = s[j];
                s[j] = temp;

                j--;
            }
        }
    }



    public static void main(String[] args) {

//344. Reverse String

        char[] s = {'h', 'e', 'l', 'l', 'o'};

        Solution.reverseString(s);

        for(int i = 0; i< s.length; i++){
            System.out.print(s[i] + " ");
        }
    }
}
