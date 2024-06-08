package replace_words;

import java.util.Arrays;
import java.util.List;

public class ReplaceWords {

    public static String replaceWords(List<String> dictionary, String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder outputSentence = new StringBuilder();
        for(int i=0; i<words.length; i++){
            int wordLength = words[i].length();
            for(int j=1; j<=wordLength;j++){
                if(dictionary.contains(words[i].substring(0,j))) {
                    words[i] = words[i].substring(0, j);
                    break;
                }
            }
            outputSentence.append(words[i]).append(" ");
        }
        return outputSentence.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(replaceWords(Arrays.asList("a","b","c"), "aadsfasf absbs bbab cadsfafs"));


    }
}
