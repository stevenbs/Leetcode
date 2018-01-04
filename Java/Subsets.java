class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(nums,0,new ArrayList<>(),list);
        return list;
    }
     private void backtrack(int[] nums, int index, List<Integer> tempList,  List<List<Integer>> allSubsets){
       
       allSubsets.add(new ArrayList<>(tempList)); //add all the cases irrespective of all the elements
        
        for(int i=index; i< nums.length; i++){
            tempList.add(nums[i]);
            //allSubsets.add(new ArrayList<>(tempList));
            backtrack(nums, i+1, tempList, allSubsets);
            tempList.remove(tempList.size()-1);
        }
    }