class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        List<Integer> list = new ArrayList<Integer>();
        for(int i =0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                map.put(nums1[i],map.get(nums1[i])+1);
            }
            else{
                map.put(nums1[i],1);
            }
        }
        for(int n=0;n<nums2.length;n++){
            if(map.containsKey(nums2[n]) && map.get(nums2[n])>0){
                list.add(nums2[n]);
                map.put(nums2[n],map.get(nums2[n])-1);
            }
        }
        int [] result = new int[list.size()];
        for(int m =0;m<list.size();m++){
            result[m]= list.get(m);
        }
        return result;
    }
}
