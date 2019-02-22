package validkuohao;

import java.util.Stack;

public class Main {
}


class Solution {
    public boolean isValid(String s) {
        if (s.equals("")) return true;
        if (s.length() % 2 == 1) return false;
        Stack<Character> stack = new Stack<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            Character c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.empty()) return false;
                Character ch = stack.pop();
                if ((ch == '{' && c != '}') || (ch == '[' && c != ']') || (ch == '(' && c != ')')) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}