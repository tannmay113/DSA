import java.util.HashMap;

public class FirstNonRepeating {

    public static Character firstNonRepeating(String str) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Find first with count = 1
        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return null; // No non-repeating character
    }

    public static void main(String[] args) {

        String s = "aabbcdde";

        Character result = firstNonRepeating(s);

        System.out.println(result); // c
    }
}