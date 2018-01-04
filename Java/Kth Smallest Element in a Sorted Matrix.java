class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        List<Integer> set = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                set.add(matrix[i][j]);
            }
        }
        Collections.sort(set);
        int n=0,m=0;
        for(Integer v : set){
            if(n<k){
                m=v;
                n++;
            }else{break;}
        }
        return m;
    }
}