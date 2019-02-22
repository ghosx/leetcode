package hammingWeight;

public class Main {
    public static void main(String[] args) {
        (new Solution()).hammingWeight(00000000000000000000000000001011);
    }
}

class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        System.out.println(s);
        return 1;
    }
}
