package pairs_of_songs_with_total_durations_divisible_by_60;

public class Main {
    public static void main(String[] args) {
        int[] t = new int[]{30, 20, 150, 100, 40};
        int r = (new Solution()).numPairsDivisibleBy60(t);
        System.out.println(r);
    }
}

/*
* 其实给一个简洁的解释把：如果一个数对60的余数为20，则与它配对的数对60的余数必然为40。故只需查看余数为40的数的个数，
* 即为配对数目，同时记录余数为20的数的数目。最后统计配对数目总和即可
* */
class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int ans = 0;
        int[] index = new int[60];
        for (int t : time) {
            int p = t % 60;
            ans += index[(60 - p) % 60];
            index[p]++;
        }
        return ans;
    }
}