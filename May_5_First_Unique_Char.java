class Solution {
    public int firstUniqChar(String s) {
        if(s.length() == 0)
            return -1;
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        String[] arr = s.split("");
        
        for(String str : arr){
            if(map.containsKey(str))
                map.put(str, map.get(str)+1);
            else
                map.put(str, 1);
        }
        
        for(int k = 0; k < arr.length; k++){
            if(map.get(arr[k]) == 1)
                return k;
        }
            
        return -1;
        
    }
}