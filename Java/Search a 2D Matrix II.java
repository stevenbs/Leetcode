class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]<=target){
                list.add(i);
            }
        }
        for(int j =0;j<list.size();j++){
            for(int n=0;n<matrix[j].length;n++){
                if(matrix[j][n]==target){
                    return true;
                }
            }
        }
        return false;
    }
}