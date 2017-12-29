class Solution {
  1):
    public int[] productExceptSelf(int[] nums) {
        int [] out = new int [nums.length];
        out[0]=1;
        for(int i=1;i<out.length;i++){
            out[i]=out[i-1]*nums[i-1];
        }
        
        int p =1;
        for(int j=nums.length-1;j>=0;j--){
            out[j]*=p;
            p*=nums[j];
        }
        return out;
    }
  2):
   public int[] productExceptSelf(int[] nums) {
        int count=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0){
                count++;
            }
        }
        if(count >1){
            return new int[nums.length];
        }
        int a=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                a+=nums[i];
            }else{
                a*=nums[i];
            }
        }
        for(int n=0;n<nums.length;n++){
            if(nums[n]==0){
                nums = new int[nums.length];
                nums[n]=a;
                return nums;
            }else{
            nums[n]=a/nums[n];
            }
        }
        return nums;
    }
}
