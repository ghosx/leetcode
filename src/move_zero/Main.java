package move_zero;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 0, 0, 0, 0, 0, 1, 0};
        Solution s = new Solution();
        s.moveZeroes(numbers);
    }

}

class Solution {
    public void moveZeroes(int[] nums) {
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (nums[i] == 0) {
                for (int j = i; j < size - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[size - 1] = 0;
                size--;
            }
            if (nums[i] == 0) i--;
        }
        for (int x : nums
        ) {
            System.out.println(x);
        }
    }
}