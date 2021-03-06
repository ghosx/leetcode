package fibonacci_number;

public class Main {
}

class Solution {
    public int fib(int N) {
        int[] res = new int[31];
        res[0] = 0;
        res[1] = 1;
        for (int i = 2; i < 31; i++) {
            res[i] = res[i - 1] + res[i - 2];
        }
        return res[N];
    }
}