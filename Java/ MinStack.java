class MinStack {

    /** initialize your data structure here. */
    LinkedList<Integer> list = null;
    int min = Integer.MAX_VALUE;
    public MinStack() {
        list = new LinkedList<Integer>();
    }
    
    public void push(int x) {
         if(x<=min) {
            list.addFirst(min);
            min = x;
        }
        list.addFirst(x);
    }
    
    public void pop() {
        int num = list.removeFirst();
        if(num==min) min = list.removeFirst();
        
    }
    
    public int top() {
        return list.getFirst();
    }
    
    public int getMin() {
       return min;
    }
}
