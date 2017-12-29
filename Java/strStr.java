class Solution {
    public int strStr(String haystack, String needle) {
        String [] str = {haystack,needle};
        return str[0].indexOf(str[1]);
    }
}
