import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BlockPlacement {
    public static List<Boolean> getResults(int[][] queries) {
        Set<Integer> blockSet = new TreeSet<>();
        List<Boolean> resultList = new ArrayList<>();
        blockSet.add(0);
        for (int[] array : queries) {
            if (array[0] == 1) {
                blockSet.add(array[1]);
            } else {
                if (array[1] < array[2])
                    resultList.add(false);
                else {
                    if (blockSet.size() > 1) {
                        int maxDifference = 0;
                        List<Integer> blockList = new ArrayList<>(blockSet);
                        for (int j = 0; j < blockList.size() - 1; j++) {
                            if (maxDifference < blockList.get(j + 1) - blockList.get(j))
                                maxDifference = blockList.get(j + 1) - blockList.get(j);
                        }
                        if (array[2] <= maxDifference || array[1]-array[2]>=maxDifference)
                            resultList.add(true);
                        else
                            resultList.add(false);

                    } else {
                        resultList.add(true);
                    }
                }
            }
        }
        return resultList;
    }

    public static void main(String[] args) {
//        getResults(new int[][]{{1,7},{2,7,6},{1,2},{2,7,5},{2,7,6}}).forEach(System.out::println);
        getResults(new int[][]{{1,1},{2,4,3}}).forEach(System.out::println);
    }
}
