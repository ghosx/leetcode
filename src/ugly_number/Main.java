package ugly_number;

public class Main {
    public static void main(String[] args) {
        int n = 14;
        boolean f = (new Solution()).isUgly(n);
        System.out.println(f);

    }
}


class Solution {
    public boolean isUgly(int num) {
        if (num == 0) return false;
        while (num % 5 == 0) num /= 5;
        while (num % 3 == 0) num /= 3;
        while (num % 2 == 0) num /= 2;
        return num == 1;
    }
}