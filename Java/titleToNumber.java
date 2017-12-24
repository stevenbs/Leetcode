class Solution {
    public int titleToNumber(String s) {
            int sum=0;
	    for(int i=0;i<s.length();i++)
        {
            int k = s.charAt(i)-64;
            sum+=Math.pow(26,s.length()-1-i)*k;
        }
		return sum;
	 
    }
}
