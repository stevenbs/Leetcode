class Solution {
    public int singleNumber(int[] nums) {
        1):
        Set<Integer> str = new HashSet <Integer>();
        for(int i=0;i<nums.length;i++){
            if(str.contains(nums[i])){//use Hashset to remove the appears twich items.
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
        2):
        Map<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<nums.length;i++){
                if(map.containsKey(nums[i])){
                    map.replace(nums[i],1);
                }else{
                    map.put(nums[i],0);//use the Hashmap to count appears one is 0; twice or more is 1;
                }
            }
                int result =0;
                for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                    if(entry.getValue()==0){ // find the value is 0;
                        result= entry.getKey();
                    }
                }
            return result;
    }
    
}
