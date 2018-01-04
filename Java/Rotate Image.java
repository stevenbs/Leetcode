class Solution {
    public void rotate(int[][] matrix) {
        int temp = 0;
        for(int i = 0; i < matrix.length / 2; i ++){
            for(int j = i + 1; j < matrix[0].length - i; j ++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - 1 - j][i];
                matrix[matrix.length - 1 - j][i] = matrix[matrix.length - 1 - i][matrix.length - 1 - j];
                matrix[matrix.length - 1 - i][matrix.length - 1 - j] = matrix[j][matrix.length - 1 - i];
                matrix[j][matrix.length - 1 - i] = temp;
            }
        }
    }
}