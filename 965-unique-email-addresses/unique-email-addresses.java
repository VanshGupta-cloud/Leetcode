class Solution {
    public int numUniqueEmails(String[] emails) {
        int n=emails.length;
        HashSet<String> set=new HashSet<>();
        int count=0;
        for(int i=0;i<n;i++)
        {  
            int j=0;
           StringBuilder local=new StringBuilder();
           StringBuilder domain=new StringBuilder();
           while (true) {     
    char ch = emails[i].charAt(j); 
    if (ch == '@') break;       
            if(ch=='.')
            {  j++;
               continue;
            }
           else if(ch=='+')
              {
                while(ch!='@')
                {
                    ch= emails[i].charAt(++j);
                  
                }
                break;
              }
              else
              {
                local.append(emails[i].charAt(j));
              }
              j++;            
            }

             int k=emails[i].length()-1;
             while(emails[i].charAt(k)!='@'){
                domain.insert(0,emails[i].charAt(k));
                k--;
             }
             if(domain.toString().contains(".com")&&domain.length()>4)
             {
            String str= local.toString() + "@"+ domain.toString();
              set.add(str);             
             }
        }
        return set.size();

    }
}