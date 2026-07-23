class Solution {
    public int repeatedStringMatch(String a, String b) {
      StringBuilder sb=new StringBuilder(a);
        int m=b.length();
        int i=1;
        while(sb.length()<=m){  

            if(sb.toString().contains(b))
            return i;
            else{
            sb.append(a);
            i++;}
           }
           if (sb.toString().contains(b)) {
            return i;
        }
              if(sb.append(a).toString().contains(b))
              {
                return i+1;
              }
       return -1;
    }
    
}