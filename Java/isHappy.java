class Solution {
    public boolean isHappy(int n) {
        Set<Integer>set = new HashSet<Integer>();
        set.add(n);
        int sum = numbers(n);
        while(sum!=1){
            if(set.contains(sum)){
                return false;
            }else{
            set.add(sum);
            sum =numbers(sum);
            }
        }
        return true;
    }
    public int numbers(int n){
        int sum =0;
        int remind = 0;
        if(n==0) return 0;
        while(n!=0){
            remind = n%10;
            n/=10;
            sum+=remind*remind;
        }
        return sum;
    }
}
