package sum_of_even_numbers_after_queries;

public class Main {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        int[][] queries = {{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};
        int[] b = (new Solution()).sumEvenAfterQueries(A, queries);
        for (int t : b
        ) {
            System.out.println(t);
        }
    }
}

class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] B = new int[A.length];
        int sum = 0;
        for (int k = 0; k < A.length; k++) {
            if (A[k] % 2 == 0) sum += A[k];
        }
        for (int i = 0; i < queries.length; i++) {
            B[i] = sum;
            if (A[queries[i][1]] % 2 == 0 && queries[i][0] % 2 == 0) {
                B[i] += queries[i][0];
                sum += queries[i][0];
            } else if (A[queries[i][1]] % 2 != 0 && queries[i][0] % 2 == 0) {
                B[i] = sum;
            } else if (A[queries[i][1]] % 2 == 0 && queries[i][0] % 2 != 0) {
                B[i] -= A[queries[i][1]];
                sum -= A[queries[i][1]];
            } else {
                B[i] += A[queries[i][1]];
                B[i] += queries[i][0];
                sum += A[queries[i][1]];
                sum += queries[i][0];
            }
            A[queries[i][1]] += queries[i][0];
        }
        return B;
    }
}