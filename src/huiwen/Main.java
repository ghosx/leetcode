package huiwen;

public class Main {
    public static void main(String[] args) {
//        String s = "A man, a plan, a canal: Panama";
        String s = "123@321";
        boolean r = (new Solution()).isPalindrome(s);
        System.out.println(r);
    }
}

class Solution {
    public boolean isPalindrome(String s) {
        if (s.equals("")) return true;
        String s1 = "";
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] ch = s.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            s1 = s1 + ch[i];
        }
        if (s1.equals(s)) {
            return Boolean.TRUE;
        }
        return false;
    }
}