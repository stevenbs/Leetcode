class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head!=null){
            ListNode tempOdd = head;
            ListNode tempEven = head.next;
            ListNode even = tempEven;
            while(tempEven!=null && tempEven.next!=null){
                tempOdd.next = tempOdd.next.next;
                tempEven.next = tempEven.next.next;
                tempOdd = tempOdd.next;
                tempEven = tempEven.next;
            }
            tempOdd.next = even;
            
        }
        return head;
        
       
           
       }
        
    
}