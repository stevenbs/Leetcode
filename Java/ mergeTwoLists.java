class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(-1);
        ListNode perhead = pre;
        while(l1!=null && l2!=null)
        {
            if(l1.val<=l2.val){
                perhead.next = l1;
                l1=l1.next;
                perhead = perhead.next;
                
            }else{
                perhead.next =l2;
                l2=l2.next;
                perhead = perhead.next;
            }
        }
        if(l1==null){
            perhead.next=l2; 
        }else{
            perhead.next = l1;
        }
        return pre.next;
    }
}
