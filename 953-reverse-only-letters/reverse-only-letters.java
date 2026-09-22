class Solution {
    public String reverseOnlyLetters(String s) {
        int l=0;
      int r=s.length()-1;
       StringBuilder sb=new StringBuilder(s);
       while(l<=r)
        {
         char x=s.charAt(l);
         char y=s.charAt(r);

         if(Character.isLetter(x)&&Character.isLetter(y))
           {
         swap(x,y);
         sb.setCharAt(l,y);
         sb.setCharAt(r,x);
         l++;
         r--;
           }
           else if(Character.isLetter(x))
           {
            r--;
           }
           else if(Character.isLetter(y))
           {
            l++;
           }
           else
           {
            l++;
            r--;
           }
        }
        return sb.toString();
    }
    public void swap(char x,char y)
    {
        char temp=x;
        x=y;
        y=temp;
    }
}