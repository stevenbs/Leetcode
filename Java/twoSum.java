class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer>list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        int id =0;
        int a=0;
        for(int n=0;n<list.size();n++){
            int num = target-list.get(n);
            if(list.contains(num)&& list.indexOf(num)!=n){
                 a =n;
                id = list.indexOf(num);
                break;
            }
        }
        return new int[]{a,id};
    }
}
