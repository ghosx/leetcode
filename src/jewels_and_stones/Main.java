package jewels_and_stones;

public class Main {
}


class Solution {
    public int numJewelsInStones(String J, String S) {
        if (J.length() == 0) return 0;
        int res = 0;
        for (int i = 0; i < S.length(); i++) {
            if (J.indexOf(S.charAt(i)) != -1) {
                res++;
            }
        }
        return res;
    }
}