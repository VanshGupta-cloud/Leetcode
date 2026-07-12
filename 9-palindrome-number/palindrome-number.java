class Solution {
    public boolean isPalindrome(int x) {
        int dig,temp,n=0;
        int sum=0;
        if(x<0)
        return false;
        
         temp=x;
        while(temp!=0){
            dig=temp%10;
            sum=sum*10+dig;
            n--;
            temp=temp/10;
        }
        return sum==x;
    }
}