class Solution {
    public boolean wordPattern(String pattern, String s) {
       HashMap<Character,String> map=new HashMap<>();
       HashSet<String> set=new HashSet<>();
        String[]arr=s.split(" ");
       if(pattern.length()!=arr.length)
       return false;
      for(int i=0;i<pattern.length();i++)
      {
      char ch=pattern.charAt(i);
      String sb=arr[i];
      //Case1:check if the key exits in map
      if(map.containsKey(ch))
      {//checks if the exiting key referenced to the value(string) is equal to the current word.
        if(!map.get(ch).equals(sb))
        {
            return false;
        }
      }
      //Case2:if the key is not yet in map
      else
      {//but the current word is already in set/and (map) this means wrong mismatch
        if(set.contains(sb))
        {
            return false;
        }
      }
      map.put(ch,sb);
      set.add(sb);
      }
      return true;
     
    }
}