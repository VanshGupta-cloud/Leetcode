class Solution {
    public int repeatedStringMatch(String a, String b) {
      String original_a=a;
        int m=b.length();
        int i=1;
        while(true){
          int n=a.length();
            if(n>m)
            { if(a.contains(b.substring(0,m))){
                return i;              
            }
                else if((a+a).contains(b))
                {
                 return i+1;
                }
                else{
                return -1;
                }
            }
           else if(n<=m)
           {
            if(a.contains(b))
            return i;
            else{
            a+=original_a;
            i++;}
           }
              
        }
       
    }
    
}