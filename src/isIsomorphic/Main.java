package isIsomorphic;

public class Main {
}


class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        int l = s.length();
        for (int i = 0; i < l - 1; i++) {
            if (s.indexOf(s.charAt(i)) == t.indexOf(t.charAt(i))) continue;
            return false;
        }
        return true;
    }
}