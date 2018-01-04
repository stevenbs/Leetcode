class Solution {
    List<TreeNode> list = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        List<TreeNode> list1= new ArrayList<>();
        list1 = helper(root);
        return list1.get(k-1).val;
    }
    
     public  List<TreeNode> helper( TreeNode n) {
        if (n.left != null) helper(n.left);
        list.add(n);
        if (n.right != null) helper(n.right);
         return list;
     }
}