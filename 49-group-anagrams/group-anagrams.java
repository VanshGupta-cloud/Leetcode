class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n =strs.length;
HashMap<String,List<String>> map=new HashMap<>();
     for(int i=0;i<n;i++)
      {
        char[] arr=strs[i].toCharArray();
        Arrays.sort(arr);
       String str=new String(arr);

       map.putIfAbsent(str,new ArrayList<>());
       map.get(str).add(strs[i]);

      }
      return new ArrayList<>(map.values());
    }
}