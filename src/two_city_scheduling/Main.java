package two_city_scheduling;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int[][] costs = {{10, 20}, {30, 200}, {400, 50}, {30, 20}};
        int sum = (new Solution()).twoCitySchedCost(costs);
        System.out.println(sum);
    }
}


class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return ((o1[0] - o1[1]) - (o2[0] - o2[1]));
            }
        });
        int len = costs.length;
        int res = 0;
        for (int i = 0; i < len; i++) {
            res += costs[i][i < len / 2 ? 0 : 1];
        }
        return res;
    }
}