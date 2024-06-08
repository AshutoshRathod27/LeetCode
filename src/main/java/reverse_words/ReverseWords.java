package reverse_words;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWords {

    public static String reverseWords(String s) {
        List<String> stringList = Stream.of(s.split(" ")).collect(Collectors.toList());
        StringBuilder output = new StringBuilder();
        for (int i = stringList.size() - 1; i >= 0; i--) {
            output.append(stringList.get(i)).append(" ");
        }
        return String.valueOf(output).trim().replaceAll("\\s+"," ");
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }
}
