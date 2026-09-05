class Solution {
    public boolean canWinNim(int n) {
        if(n/3==0)
        return true;
       
        if(n%2==0)
        {
          int k= n/2; 

           if(n/3>0&&k%2==0)
       return false;
       if(n/3>0&&k%2!=0)
       return true;
          if(k%2==0)
        return true;
        else
        return false;
            
      
        }
        else
        {
          if(n%3==0)
         return true;

          return true;
        }
    }
}