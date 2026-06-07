import java.util.Locale;

public class Ques5 {
    public static void main(String[] args) {

//        5. Check a Word is Present in a String

        String str = "Check a Word is Present in a String";
        String[] strArray = str.split(" ");
        String s = "word"; // check this is present or not;
        String strInLower = s.toLowerCase();
        for(String strr: strArray){

            String ss = strr.toLowerCase();
            if(ss.equals(s)){
                System.out.println("yes word is present");
            }
        }

    }
}
