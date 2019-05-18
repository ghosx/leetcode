package longest_word_in_dictionary;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] ss = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        String q = (new Solution()).longestWord(ss);
        System.out.println(q);
    }
}


class Solution {
    public String longestWord(String[] words) {
        if (words == null) return "";
        int mmax = Integer.MIN_VALUE;
        List<String> mwords = new ArrayList<>();
        for (String s : words
        ) {
            if (s.length() >= mmax) {
                mmax = s.length();
                mwords.add(s);
            }
        }
        Collections.sort(mwords, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.compareTo(o2) > 0) {
                    return -1;
                } else if (o1.compareTo(o2) < 0) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        return mwords.get(0);
    }
}