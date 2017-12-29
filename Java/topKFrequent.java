import java.util.Map.Entry;
class Solution {
    public List<Integer> topKFrequent(int[] nums, int n) {
         Map<Integer,Integer> map = new HashMap<>();
         Map<Integer,Integer> map2 = new LinkedHashMap<>();
         for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        map.entrySet().stream()
                .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()))
                .forEach(k -> map2.put(k.getKey(),k.getValue()));
        List<Integer> list1 = new ArrayList<>();
        int m=0;   
        for(Integer k : map2.keySet()){
          if(m<n){
            list1.add(k);m++;}else{break;}
        }
        return list1;
    
    }
}
