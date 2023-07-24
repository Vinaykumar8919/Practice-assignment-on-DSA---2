class Solution {
    public void rotate(int[][] matrix) {
        int max = matrix.length;
        for(int i =0;i<max;i++) {
            for(int j =i;j<max;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i =0;i<max;i++) {
            for(int j = 0;j<max/2;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][max-j-1];
                matrix[i][max-j-1] = temp;
            }
        }
        
    }
}