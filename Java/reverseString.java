import java.util.*;
class reverseString {
    public String reverseString(String s) {
      char[] word = s.toCharArray();
        int i = 0;
        int j = word.length - 1;
        
        while(i<j){
            char c = word[i];
            word[i] = word[j];
            word[j] = c;
            i++;
            j--;
        }
        
        return new String(word);
    }
    
}
