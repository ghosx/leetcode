package maximum_product_of_three_numbers;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, -1, -100};
        int res = new Solution().maximumProduct(nums);
        System.out.println(res);
    }
}

class Solution {
    public int maximumProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int len = nums.length;
        Arrays.sort(nums);
        int a = nums[len - 1] * nums[len - 2] * nums[len - 3];
        int b = nums[0] * nums[1] * nums[len - 1];
        return a > b ? a : b;
    }
}