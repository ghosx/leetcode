package di_string_match;

public class Main {
    public static void main(String[] args) {
        String s = "DDI";
        int[] res = (new Solution()).diStringMatch(s);
        for (int i : res
        ) {
            System.out.println(i);
        }
    }
}


class Solution {
    public int[] diStringMatch(String S) {
        int len = S.length();
        int[] A = new int[len + 1];
        int max = len;
        int min = 0;
        for (int i = 0; i < len; i++) {
            if (S.charAt(i) == 'I') {
                A[i] = min++;
            } else {
                A[i] = max--;
            }
        }
        A[len] = min;
        return A;
    }
}