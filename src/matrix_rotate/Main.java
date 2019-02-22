package matrix_rotate;

public class Main {
    public static void main(String[] args) {
        int[][] nums = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        Solution s = new Solution();
        s.rotate(nums);
        for (int[] i : nums
        ) {
            for (int j : i
            ) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}

class Solution {
    public void rotate(int[][] matrix) {
        int size = matrix.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[size - i - 1][size - j - 1];
                matrix[size - i - 1][size - j - 1] = t;
            }
        }
        for (int i = 0; i < size / 2; i++) {
            for (int j = 0; j < size; j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[size - i - 1][j];
                matrix[size - i - 1][j] = t;
            }
        }
    }
}
