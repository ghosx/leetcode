package power_of_two;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n < 0) return false;
        int MaxPow = (int) Math.pow(3, Math.log(Integer.MAX_VALUE) / Math.log(3));
        return (MaxPow % n == 0);
    }
}

