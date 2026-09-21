class Solution {
    public boolean checkDivisibility(int n) {
        String s=String.valueOf(n);
      int sum=0;
      int product=1;
      for(int i=0;i<s.length();i++)
      { 
        int x=Integer.parseInt(String.valueOf(s.charAt(i)));
        sum+=x;
        product*=x;
      }
      int megasum=sum+product;
      if(n%megasum==0)
      {
        return true;
      }
        return false;
    }
}