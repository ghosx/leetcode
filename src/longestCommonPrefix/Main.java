package longestCommonPrefix;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"a", "cc"};
        String s = (new Solution()).longestCommonPrefix(strings);
        System.out.println(s);
    }

}


class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        int len = 0;
        int min = 999999;
        String mins = "";
        String maxs = "";
        int max = 0;
        for (String s : strs
        ) {
            if (s == null || s.equals("")) return "";
            if (s.length() < min) {
                min = s.length();
                mins = s;
            }
            if (s.length() > max) {
                max = s.length();
                maxs = s;
            }
        }
        Character v = maxs.charAt(len);
        String t = v.toString();
        boolean f = false;
        int j = 0;
        while (j < min) {
            for (int i = 0; i < strs.length; i++) {
                if (!strs[i].startsWith(t)) {
                    f = true;
                    break;
                }
            }
            if (f) {
                break;
            } else {
                len++;
                if (len >= min) {
                    return mins;
                }
                v = maxs.charAt(len);
                t += v.toString();
            }
            j++;
        }
        return strs[0].substring(0, len);
    }
}