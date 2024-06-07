import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MedianOfSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> arrayList = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        arrayList.addAll(Arrays.stream(nums2).boxed().collect(Collectors.toList()));
        Collections.sort(arrayList);
        if(arrayList.size()==1){
            return arrayList.get(0);
        }
        if(arrayList.size()%2 != 0)
            return arrayList.get(arrayList.size()/2);
        else
            return (double) (arrayList.get(arrayList.size()/2) + arrayList.get((arrayList.size()/2) - 1))/2;
    }
    public static void main(String[] args) {

        System.out.println(findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
    }
}
