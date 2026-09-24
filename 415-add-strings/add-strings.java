class Solution {
    public String addStrings(String num1, String num2) {
        int n = num1.length();
        int m = num2.length();
        int c = 0;
        int i = n - 1;
        int j = m - 1;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0 || c > 0) {
            if (i >= 0) {
                c += num1.charAt(i) - '0';
            }
            if (j >= 0) {
                c += num2.charAt(j) - '0';
            }
            sb.append(c % 10);
            c /= 10;
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}