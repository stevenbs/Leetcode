class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<A.length;i++){
            for(int j =0;j<B.length;j++){
                int sum = A[i]+B[j];
                if(map.containsKey(sum)){
                    map.put(sum,map.get(sum)+1);
                }else{
                    map.put(sum,1);
                }
            }
        }int count =0;
        for(int n=0;n<C.length;n++){
            for(int m=0;m<D.length;m++){
                int sum2 = -(C[n]+D[m]);
                if(map.containsKey(sum2)){
                    count+=map.get(sum2);
                }
            }
        }
        return count;
    }
}
