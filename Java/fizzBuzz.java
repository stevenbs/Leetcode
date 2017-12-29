import java.util.*;
class fizzBuzz{
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>();
        for(int i=1;i<=n;i++){
              if(i%3 ==0 && i%5==0){
                result.add("FizzBuzz");// just check the number could %3 or %5 or %3 and %5.
              }else if(i%3 ==0){
                result.add("Fizz");
              }else if(i%5==0){
                result.add("Buzz");
              }else{
                result.add(Integer.toString(i));
              }
            }
        return result;
    }
}
