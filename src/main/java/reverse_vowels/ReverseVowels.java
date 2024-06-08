package reverse_vowels;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseVowels {
    public static String reverseVowels(String s) {
        String reverseString = new StringBuilder(s).reverse().toString();
        List<Character> characterList = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        List<Character> reverseVowelList = new ArrayList<>();
        for (char character : reverseString.toCharArray()) {
            if (characterList.contains(character))
                reverseVowelList.add(character);
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (characterList.contains(s.charAt(i))) {
                s = s.substring(0, i) + reverseVowelList.get(count) + s.substring(i + 1);
                count++;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("leotcede"));
    }
}
