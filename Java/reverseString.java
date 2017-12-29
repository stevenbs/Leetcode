import java.util.*;
class reverseString {
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
    
}
