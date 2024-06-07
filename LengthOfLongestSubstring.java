import java.util.*;
import java.util.regex.Pattern;

public class LengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        List<Character> characterList = new ArrayList<>();
        List<Integer> countList = new ArrayList<>();
        int count = 0;
        boolean shifted = false;
        if("".equals(s))
            return 0;
        if(" ".equals(s))
            return 1;
        if(Pattern.compile("[a-zA-Z]").matcher(s).matches())
            return 1;

        for (Character c: s.toCharArray()) {
            if(characterList.contains(c)) {
                countList.add(count);
                characterList = new ArrayList<>();
                count = 0;
                shifted = true;
            }
            else{
                characterList.add(c);
                count++;
            }
            if(shifted){
                count++;
                characterList.add(c);
                shifted = false;
            }
        }
        return Collections.max(countList);
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
