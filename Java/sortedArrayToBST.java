class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return recurse(nums,0,nums.length-1);
    }
   public TreeNode recurse(int[] nums, int lo, int hi) {
        if (hi < lo) { return null; }
        int mid = (lo + hi)/2;
        // Create tree structure here
        TreeNode root = new TreeNode(nums[mid]);
        root.left = recurse(nums, lo, mid - 1);
        root.right = recurse(nums, mid + 1, hi);
        return root;
    }
}
