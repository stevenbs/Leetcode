class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List < Integer > res = new ArrayList < > ();
        if(root!=null){inorder(res,root);}
        return res;
    }

    public void inorder(List<Integer> result,TreeNode cur){
        if(cur!=null){
            inorder(result,cur.left);
            result.add(cur.val);
            inorder(result,cur.right);
        }
    }
    
}
