package third_maximum_number;

public class Main {
    public static void main(String[] args) {
        int[] n = {3, 2, 1};
        int a = (new Solution()).thirdMax(n);
        System.out.println(a);
    }
}


class Solution {
    public int thirdMax(int[] nums) {

        if (nums.length == 1) return nums[0];
        else if (nums.length == 2) return Math.max(nums[0], nums[1]);
        else {
            int mmax = nums[0], mmid = Integer.MIN_VALUE, mmin = Integer.MIN_VALUE;
            for (int i : nums
            ) {
                if (i > mmax) {
                    mmin = mmid;
                    mmid = mmax;
                    mmax = i;
                } else if (i > mmid && i < mmax) {
                    mmin = mmid;
                    mmid = i;
                } else if (i > mmin && i < mmid) {
                    mmin = i;
                }
            }
            if (mmin == mmax) {
                return mmax;
            }
            return mmin;
        }
    }
}