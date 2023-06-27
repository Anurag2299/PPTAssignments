import java.util.HashMap;
import java.util.Map;
 
class FirstCharacter {
    public static void main(String[] args)
    {
        String str = "aabbccddef";
        Character c = printNonrepeated(str);
        System.out.println( c == null ? -1 :str.indexOf(c));
    }
 
    public static Character printNonrepeated(String str)
    {
        Map<Character, Integer> freq
            = new HashMap<Character, Integer>();
        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
 
        for (char c : str.toCharArray()) {
            if (freq.get(c) == 1) {
                return c;
            }
        }
         return null;
    }
}
