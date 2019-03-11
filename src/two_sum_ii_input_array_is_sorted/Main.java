package two_sum_ii_input_array_is_sorted;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {0, 0, 3, 4};
        int target = 0;
        int[] res = (new Solution()).twoSum(numbers, target);
        System.out.println(res[0] + "  " + res[1]);
    }
}


class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        Integer[] number = new Integer[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            number[i] = numbers[i];
        }
        List num = Arrays.asList(number);
        int t = 0;
        for (int i : numbers
        ) {
            Integer sub = target - i;
            if (map.containsKey(sub)) {
                return new int[]{num.indexOf(sub) + 1, t + 1};
            } else {
                map.put(i, num.indexOf(i));
            }
            t++;
        }
        return new int[]{-1, -1};
    }
}