package binary_search;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 2;
        int r = (new Solution()).search(nums,target);
        System.out.println(r);
    }
}

class Solution {
    public int search(int[] nums, int target) {
        if (target < nums[0]) return -1;
        if (target > nums[nums.length - 1]) return -1;
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int m = (r - l) / 2 + l;
            if (nums[m] == target) return m;
            else if (nums[m] > target) r = m - 1;
            else l = m + 1;
        }
        return -1;
    }
}