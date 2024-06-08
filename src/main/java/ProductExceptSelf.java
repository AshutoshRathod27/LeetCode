import java.util.Arrays;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int totalProduct = Arrays.stream(nums).boxed().reduce((int1, int2) -> int1 * int2).orElse(-1);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                nums[i] = Arrays.stream(nums).boxed()
                        .filter(value -> value!=0)
                        .reduce((int1, int2) -> int1 * int2).orElse(-1);
            else
                nums[i] = totalProduct / nums[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1, 1, 0, -3, 3})));
    }
}
