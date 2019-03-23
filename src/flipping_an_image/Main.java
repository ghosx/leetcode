package flipping_an_image;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[][] a = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] res = (new Solution()).flipAndInvertImage(a);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + "  ");
            }
            System.out.println("");
        }
    }
}


/*
反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。

        示例 1:

        输入: [[1,1,0],[1,0,1],[0,0,0]]
        输出: [[1,0,0],[0,1,0],[1,1,1]]
        解释: 首先翻转每一行: [[0,1,1],[1,0,1],[0,0,0]]；
        然后反转图片: [[1,0,0],[0,1,0],[1,1,1]]
        示例 2:

        输入: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
        输出: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
        解释: 首先翻转每一行: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]]；
        然后反转图片: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
        说明:

        1 <= A.length = A[0].length <= 20
        0 <= A[i][j] <= 1
*/

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] res = new int[A.length][A[0].length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] == 1) stack.add(0);
                else stack.add(1);
            }
            int k = 0;
            while (!stack.empty()) {
                res[i][k] = stack.pop();
                k++;
            }
            stack.clear();
        }
        return res;
    }
}
