package kids_with_candies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KidsWithCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Integer> intList = Arrays
                .stream(candies)
                .boxed().collect(Collectors.toList());
        return intList.stream()
                .map(value -> value + extraCandies >= Collections.max(intList))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3).forEach(System.out::println);
    }
}
