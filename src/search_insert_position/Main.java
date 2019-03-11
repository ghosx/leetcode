package search_insert_position;

public class Main {
}

class Solution {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        if (target < nums[0]) return 0;
        if (target > nums[len - 1]) return len;
        for (int i = 0; i < len; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return len;
    }
}