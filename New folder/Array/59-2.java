class Solution {
    public int[][] generateMatrix(int n) {
        int left = 0, right = n - 1, up = 0, down = n - 1, num = 1;
        int[][] result = new int[n][n];
        while (true) {
            for (int i = left; i <= right; i++) result[up][i] = num++;
            if (++up > down) break;
            for (int i = up; i <= down; i++) result[i][right] = num++;
            if (--right < left) break;
            for (int i = right; i >= left; i--) result[down][i] = num++;
            if (--down < up) break;
            for (int i = down; i >= up; i--) result[i][left] = num++;
            if (++left > right) break;
        }
        return result;
    }
}
