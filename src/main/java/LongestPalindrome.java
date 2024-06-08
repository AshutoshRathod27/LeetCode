import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors.*;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class LongestPalindrome {

    public static int longestPalindrome(String s) {
        int count = 0;
        boolean oddComponentAdded = false;
        Map<Character, Long> characterLongMap =
                s.chars().mapToObj(x -> (char) x).collect(groupingBy(x->x,counting()));
        for(Map.Entry entry:characterLongMap.entrySet()){
            Long value = (Long) entry.getValue();
            if(value%2==0)
                count+=value;
            else if(value%2!=0 && !oddComponentAdded) {
                count+=value;
                oddComponentAdded = true;
            } else {
                count+=value-1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "Aa";

        System.out.println(longestPalindrome(str));
    }
}
