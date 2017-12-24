import java.util.*;
class reverseString {
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