import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] targetArray = new int[2];
        int left = 0, right = nums.length-1;
        List<Integer> numsList = Arrays.stream(nums).boxed().sorted().collect(Collectors.toList());
        while(numsList.get(left) + numsList.get(right) != target){
            if(numsList.get(left) + numsList.get(right) < target)
                left+=1;
            else if (numsList.get(left) + numsList.get(right) > target)
                right-=1;
            else
                break;
        }
        boolean leftUpdate = false, rightUpdate = false;
        for(int i=0; i<nums.length; i++){
            if(numsList.get(left)==nums[i] && !leftUpdate) {
                targetArray[0] = i;
                leftUpdate = true;
            }
            else if(numsList.get(right)==nums[i] && !rightUpdate) {
                targetArray[1] = i;
                rightUpdate = true;
            }
        }
        return targetArray;
    }

    public static void main(String[] args) {
        int [] targetArray = twoSum(new int[]{2, 5, 5, 11},10);
        for (int ele:targetArray) {
            System.out.println(ele);
        }
    }
}
