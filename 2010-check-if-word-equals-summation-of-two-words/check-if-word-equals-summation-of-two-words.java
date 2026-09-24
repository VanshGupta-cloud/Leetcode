class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        StringBuilder sb=new StringBuilder();
        int i=firstWord.length()-1;
        int j=secondWord.length()-1;
        int c=0;
        while(i>=0||j>=0||c>0)
        {
           if(i>=0)
            {
                c+=firstWord.charAt(i)-'a';
            }
            if(j>=0)
            {
                c+=secondWord.charAt(j)-'a';
            }
            sb.append(c%10);
            c/=10;
            i--;
            j--;
        }
        String s=sb.reverse().toString();
        StringBuilder sum=new StringBuilder();
        for(char ch:targetWord.toCharArray())
        {
          sum.append(ch-'a');
        }
        int x=Integer.parseInt(s);
        int y=Integer.parseInt(sum.toString());

        if(x==y)return true;
        return false;
    }
}