class Solution {
    public int[][] generateMatrix(int n) {
        int loop = 0;
        int i, j;
        int count = 1;
        int start = 0;
        int offset = 1;
        int[][] result = new int[n][n];

        while (loop++ < n / 2) {
            for (j = start; j < n - offset; j++) result[start][j] = count++;
            for (i = start; i < n - offset; i++) result[i][j] = count++;
            for (; j > start; j--) result[i][j] = count++;
            for (; i > start; i--) result[i][j] = count++;
            start++;
            offset++;
        }
        if (n % 2 == 1) result[start][start] = count;

        return result;
    }
}
