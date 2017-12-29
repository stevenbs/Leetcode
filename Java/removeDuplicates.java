class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int n=0;
        for(Integer key : set){
            nums[n]=key;
            n++;
        }
        return set.size();
    }
}
