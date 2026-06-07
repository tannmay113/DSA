import java.util.HashMap;
import java.util.Map;

public class Ques3 {
    public static void main(String[] args) {

//        3. Check Anagram Strings

        String str1 = "listen";
        String str2 = "silent";

        if(str1.length() != str2.length()){
            System.out.println("its not anagram");
        }

        Map<Character, Integer> map = new HashMap<>();

        for(char c : str1.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c : str2.toCharArray()){

            if(!map.containsKey(c)){
                System.out.println("not anagram");
                break;
            }

            map.put(c, map.getOrDefault(c, 0) - 1);

            if(map.get(c) == 0){
                map.remove(c);
            }
        }

        if(map.isEmpty()){
            System.out.println("it anagram");
        }else {
            System.out.println("its not anagram");
        }


    }
}
