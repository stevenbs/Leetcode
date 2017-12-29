class Solution {
    public boolean isPalindrome(ListNode head) {
           List<ListNode> stack = new ArrayList<>();
        
        while (head != null){
            stack.add(head);
            head = head.next;
        }

        for (int i = 0; i <stack.size() ; i++) {
            if (stack.get(i).val != stack.get(stack.size()-i-1).val){
                return false;
            }
        }
        return true;
    }
}
