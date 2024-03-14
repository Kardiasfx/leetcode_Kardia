class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int up = 0, down = matrix.length - 1, left = 0, right = matrix[0].length - 1;
        List<Integer> result = new ArrayList<Integer>();
        while (true) {
            for (int i = left; i <= right; i++) result.add(matrix[up][i]);
            if (++up > down) break;
            for (int i = up; i <= down; i++) result.add(matrix[i][right]);
            if (--right < left) break;
            for (int i = right; i >= left; i--) result.add(matrix[down][i]);
            if (--down < up) break;
            for (int i = down; i >= up; i--) result.add(matrix[i][left]);
            if (++left > right) break;
        }
        return result;
    }
}
