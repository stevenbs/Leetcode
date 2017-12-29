public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp = headA;
        ListNode temp2 = headB;
        Set<ListNode> set = new HashSet<>();
        while(temp!=null){
            set.add(temp);
            temp=temp.next;
        }
        while(temp2!=null){
            if(set.contains(temp2)){
                return temp2;
            }
            temp2=temp2.next;
        }
        return temp2;
    }
}
