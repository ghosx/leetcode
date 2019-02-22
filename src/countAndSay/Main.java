package countAndSay;

public class Main {
    public static void main(String[] args) {
        String s = (new Solution()).countAndSay(4);
        System.out.println(s);
    }
}

class Solution {
    public String countAndSay(int n) {
        String[] s = new String[30];
        String num = "1";
        s[0] = num;
        for (int i = 1; i < s.length; i++) {
            char[] c = num.toCharArray();
            // 次数
            int ci = 0;
            int v = c[0];
            String t = "";
            for (int j = 0; j < num.length(); j++) {
                if (v == c[j]) {
                    ci++;
                } else {
                    t += ci;
                    t += v - '0';
                    ci = 1;
                    v = c[j];
                }
            }
            t += ci;
            t += v - '0';
            s[i] = t;
            num = t;
        }
        return s[n - 1];
    }
}