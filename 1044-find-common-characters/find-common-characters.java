class Solution {
    public List<String> commonChars(String[] words) {
        int []minfreq=new int[26];
        for(int i=0;i<26;i++)
        {
            minfreq[i]=Integer.MAX_VALUE;
        }
        int n=words.length;
        for(int i=0;i<n;i++)
        {
            int []freq=new int[26];
            String s=words[i];
            char[]str=s.toCharArray();
            for(int j=0;j<str.length;j++)
            {
               freq[str[j]-97]++;
            }
            
            for(int j=0;j<26;j++)
            {
                minfreq[j]=Math.min(minfreq[j],freq[j]);
            }
        }
            
       ArrayList<String>List=new ArrayList<>();
        for(int i=0;i<26;i++)
        { while(minfreq[i]>0){
            List.add(String.valueOf((char)(i+97)));
          minfreq[i]--;
          }
        }
        return List;
        
    }
}