class Solution {
    public int totalNumbers(int[] digits) {
        int[]arr=new int[10];
        for(int i=0;i<digits.length;i++)
        {
            arr[digits[i]]++;
        }
        int count=0;
       for(int i=1;i<=9;i++)
       {
        if(arr[i]==0)
        continue;
        else{
            arr[i]--;
        }
        for(int j=0;j<=9;j++){
        if(arr[j]==0)
        continue;
        else{
            arr[j]--;
        }
        for(int k=0;k<=8;k+=2)
        {
            if(arr[k]>0)
            count++;
        }
        arr[j]++;
         }
         arr[i]++;
       }
        return count;
    }
}