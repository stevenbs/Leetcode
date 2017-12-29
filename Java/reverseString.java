import java.util.*;
class reverseString {
    1):
    public String reverseString(String s) {
      char[] word = s.toCharArray();// string to charArray();
        int i = 0;//start index;
        int j = word.length - 1;//last index;
        
        while(i<j){//when j<i stop.
            char c = word[i];
            word[i] = word[j];//exchange the chars.
            word[j] = c;
            i++;
            j--;
        }
        
        return new String(word);
    }
    2):
    public String reverseString(String s) {
        String R="";
        List<String> result = new ArrayList<String>();
        for(int i=0;i<s.length();i++){
          result.add(Character.toString(s.charAt(i)));
        }
        for(int n= result.size()-1;n>=0;n--){
          R+=result.get(n);
        }
        return R;
      }
    
}
