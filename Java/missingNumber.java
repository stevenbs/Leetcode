class Solution {
    public int missingNumber(int[] nums) {
        int count =0;
        Arrays.sort(nums);
        if (nums[nums.length-1] != nums.length) {
            return nums.length;
        }
        // Ensure that 0 is at the first index
        else if (nums[0] != 0) {
            return 0;
        }

        for(int i=0;i<nums.length;i++){
            if(count == nums[i]){
                count++;
            }else{
                return count;
            }
        }
        return -1;
    }
}
