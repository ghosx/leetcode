package reverse_string_ii;

public class Main {
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 8;
        String q = (new Solution()).reverseStr(s, k);
        System.out.println(q);
    }
}

class Solution {
    public String reverseStr(String s, int k) {
        String ss = "";
        int index = 1;
        for (int i = 0; i <= (int) (s.length() / k / 2 + 0.5); i++) {
            for (int j = 0; j < k && (2 * i + 1) * k - j - 1 < s.length(); j++) {
                ss += s.charAt((2 * i + 1) * k - j - 1);
            }
            for (int j = 0; j < k && (2 * i + 1) * k + j < s.length(); j++) {
                ss += s.charAt((2 * i + 1) * k + j);
            }
        }
        while (ss.length() != s.length()) {
            ss += s.charAt(s.length() - index++);
        }
        return ss;
    }
}