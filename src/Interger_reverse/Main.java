package Interger_reverse;

public class Main {
    public static void main(String[] args) {
        int x = 120;
        int b = (new Solution()).reverse(x);
        System.out.println(b);
    }
}


class Solution {
    public int reverse(int x) {
        long result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x = x / 10;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            result = 0;
        }
        return (int) result;
    }
}