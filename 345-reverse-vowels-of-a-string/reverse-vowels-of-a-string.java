class Solution {
    public String reverseVowels(String s) {
        if(s.length()==0)return s;
        int l=0;
        int r=s.length()-1;
        StringBuilder sb= new StringBuilder(s);
       while(l<=r)
        {
            char a=s.charAt(l);
            char b=s.charAt(r);
           if((a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')&&(b=='a'||b=='e'||b=='i'||b=='o'||b=='u'||b=='A'||b=='E'||b=='I'||b=='O'||b=='U'))
           {
            swap(a,b);
            sb.setCharAt(l,b);
            sb.setCharAt(r,a);
            l++;
            r--;
           }
        else if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
        {
          r--;
        }
        else if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u'||b=='A'||b=='E'||b=='I'||b=='O'||b=='U')
        {
            l++;
        }
        else{
            l++;
            r--;
        }
        }
         return sb.toString();
    }
    public void swap(char c,char x)
    {
        char temp=x;
        x=c;
        c=temp;
    }
}