public class Ques1 {
    public static void main(String[] args) {

//        1. Check if a String is a Palindrome

        String str1 = "tatt";

        String str2 = "";
       for(int i = str1.length()-1; i >= 0 ;i--){
           str2 += str1.charAt(i);
       }

        if(str2.equals(str1)){
            System.out.println("its palindrome");
        }else {
            System.out.println("not palindrome");
        }

    }
}
