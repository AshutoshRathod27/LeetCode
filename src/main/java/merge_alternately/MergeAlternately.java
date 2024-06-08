package merge_alternately;

import javax.xml.stream.StreamFilter;

public class MergeAlternately {

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder output = new StringBuilder();
        for(int i=0; i<word1.length()+word2.length();i++){
            if(i>=word1.length() && i>word2.length())
                break;
            if(i<word1.length())
                output.append(word1.charAt(i));
            if(i<word2.length())
                output.append(word2.charAt(i));
        }
        return String.valueOf(output);
    }
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abcd", "pq"));
    }
}
