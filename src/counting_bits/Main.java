package counting_bits;

public class Main {
    public static void main(String[] args) {
        int num = 5;
        int[] res = (new Solution()).countBits(num);
        for (int i : res
        ) {
            System.out.println(i);
        }
    }
}


class Solution {
    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            res[i] = countOne(i);
        }
        return res;
    }

    public int countOne(int num) {
        int n = num;
        int count = 0;
        while (n != 0) {
            count++;
            n &= (n - 1);
        }
        return count;
    }
}