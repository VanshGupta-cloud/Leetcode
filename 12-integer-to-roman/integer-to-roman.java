 class Solution {
    public String intToRoman(int num) {
        int n=num;
        StringBuilder sb= new StringBuilder();

     while(n>=1000)
    {
       n=n-1000;
       sb.append("M");
    }
    while(n>=900)
    {
        n=n-900;
        sb.append("CM");
    }
    while(n>=500)
    {
        n=n-500;
        sb.append("D");
    }
    while(n>=400)
    {
        n=n-400;
        sb.append("CD");
    }
    while(n>=100)
    {
        n=n-100;
        sb.append("C");
    }
    while(n>=90)
    {
        n=n-90;
        sb.append("XC");
    }
    while(n>=50)
       {
    n=n-50;
    sb.append("L");
}
    while(n>=40){
        n=n-40;
        sb.append("XL");
    }
    while(n>=10)
    {
        n=n-10;
        sb.append("X");
    }
    while(n>=9)
    {
        n=n-9;
        sb.append("IX");
    }
    while(n>=5)
    {
        n=n-5;
        sb.append("V");
    }
    while(n>=4)
    {
        n=n-4;
        sb.append("IV");
    }
    while(n>=1)
    {
        n=n-1;
        sb.append("I");
    }
    return sb.toString();
    }
}
    