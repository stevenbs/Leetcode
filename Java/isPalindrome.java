class Solution {
    public boolean isPalindrome(String s) {
        boolean check = true;
        if(s.equals("")){
            return true;
        }
        else{
                String str = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
                char[] c = str.toCharArray();
                //if(c.length ==1)return true;
                for(int i=0;i<c.length/2;i++){
                    if(c[i]!=c[c.length-1-i]){
                        return false;
                    }
                }
            return check;

            }
        }
    
}
