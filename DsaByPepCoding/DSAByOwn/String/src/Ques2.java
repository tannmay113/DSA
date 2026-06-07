import java.util.HashMap;
import java.util.Map;

public class Ques2 {
    public static void main(String[] args) {

//        2. Find First Non-Repeating Character in String
//        process string and return the first non-repeating element.
//                If the string does not have any non-repeating elements, it just returns null
//        String s = "aabbcdde";
//        output = "c"


        String s = "aabbcdde";

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){

            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(char c : s.toCharArray()){
             if(map.get(c) == 1){
                 System.out.println(c);
                 break;
             }
        }
    }
}
