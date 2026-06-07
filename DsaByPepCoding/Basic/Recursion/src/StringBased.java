public class StringBased {

    public static String ReverseString(String str){

        if(str.length() <= 1) return str;

        return ReverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {

//      1. Reverse a string using recursion.
        String str = "hello";
        String rev = ReverseString(str);
        System.out.println(rev);


//      2. Check if a string is palindrome using recursion.
        String s = ""

    }
}
