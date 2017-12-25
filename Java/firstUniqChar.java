class Solution {
    public int firstUniqChar(String s) {
        1):
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),Integer.MAX_VALUE);
            }else{
                map.put(s.charAt(i),i);
                list.add(i);
            }
        }
         for(int n = 0; n < list.size(); n++){
            if(map.get(s.charAt(list.get(n))) != Integer.MAX_VALUE){
                return list.get(n);
            }
        }
        return -1;
    }
    2):
    Map<Character,Integer> map = new LinkedHashMap<>();
    for(int i =0;i<s.length();i++){
        if(map.containsKey(s.charAt(i))){
            map.put(s.charAt(i),Integer.MAX_VALUE);
        }else{
            map.put(s.charAt(i),i);
        }
    }
    
    for(Entry<Character,Integer>entry : map.entrySet()){
        if(entry.getValue()!=Integer.MAX_VALUE){
            
            return entry.getValue();
        }
    }
        return -1;
    }
}
