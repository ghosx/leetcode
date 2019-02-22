package strstr;


public class Main {
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issipi";
        int a = (new Solution()).strStr(haystack, needle);
        System.out.println(a);
    }
}


class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.equals("")) return 0;
        int len1 = haystack.length();
        int len2 = needle.length();
        if (len2 > len1 || len1 == 0) return -1;
        boolean flag;
        // 这里注意len1-len2 新手容易协程i < len1 这样会在下面超出数组边界
        for (int i = 0; i <= len1 - len2; i++) {
            flag = true;
            for (int j = 0; j < len2; j++)
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    flag = false;
                    break;
                }
            if (flag) return i;
        }
        return -1;
    }
}

