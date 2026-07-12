class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'M') {
                sum += 1000;
            }
            if (ch == 'D') {
                sum += 500;
            }
            if (ch == 'C') {
                if (s.length() - 1 == i) {
                    sum += 100;
                } else if (s.charAt(i + 1) == 'M') {
                    sum += 900;
                    i++;
                } else if (s.charAt(i + 1) == 'D') {
                    sum += 400;
                    i++;
                } else
                    sum += 100;
            }
            if (ch == 'L') {
                sum += 50;
            }
            if (ch == 'X') {
                if (s.length() - 1 == i) {
                    sum += 10;
                } else if (s.charAt(i + 1) == 'L') {
                    sum += 40;
                    i++;
                } else if (s.charAt(i + 1) == 'C') {
                    sum += 90;
                    i++;
                } else
                    sum += 10;
            }
            if (ch == 'V') {
                sum += 5;
            }
            if (ch == 'I') {
                if (s.length() - 1 == i) {
                    sum += 1;
                } else if (s.charAt(i + 1) == 'V') {
                    sum += 4;
                    i++;
                } else if (s.charAt(i + 1) == 'X') {
                    sum += 9;
                    i++;
                } else
                    sum += 1;
            }
        }
        return sum;
    }
}