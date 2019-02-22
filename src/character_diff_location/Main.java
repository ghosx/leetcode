package character_diff_location;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean result = (new Solution()).isAnagram(s, t);
        System.out.println(result);
    }

}

/*
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        System.out.println(arr1);
        System.out.println(arr2);
        for (int i = 0; i < arr1.length; i++) {
            if (!map1.containsKey(arr1[i])) {
                map1.put(arr1[i], 1);
            } else {
                int value = map1.get(arr1[i]) + 1;
                map1.put(arr1[i], value);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (!map2.containsKey(arr2[i])) {
                map2.put(arr2[i], 1);
            } else {
                int value = map2.get(arr2[i]) + 1;
                map2.put(arr2[i], value);
            }
        }
        if (map1.size() != map2.size()) {
            return false;
        } else {
            for (Map.Entry entry : map1.entrySet()) {
                char key = (char) entry.getKey();
                int value = (int) entry.getValue();
                if ((!map2.containsKey(key)) || value != map2.get(key)) {
                    return false;
                }

            }
            return true;
        }
    }
}*/
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}