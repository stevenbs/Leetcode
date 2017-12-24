class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> str = new HashSet <Integer>();
        for(int i=0;i<nums.length;i++){
            if(str.contains(nums[i])){
                str.remove(nums[i]);
            }
            else{
                str.add(nums[i]);
            }
        }
            int result = 0;
            Iterator<Integer> it = str.iterator();
            while(it.hasNext()){
            result = it.next();
            }
            return result;
        
    }
}
