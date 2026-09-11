class Solution {
    public int totalNumbers(int[] digits) {
        int[] digitCount = new int[10];
        for (int d : digits) {
            digitCount[d]++;
        }

        int validCount = 0;
        for (int num = 100; num < 1000; num += 2) {
            int hundreds = num / 100;
            int tens = (num / 10) % 10;
            int units = num % 10;

            int[] req = new int[10];
            req[hundreds]++;
            req[tens]++;
            req[units]++;

            boolean possible = true;
            for (int i = 0; i < 10; i++) {
                if (digitCount[i] < req[i]) {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                validCount++;
            }
        }

        return validCount;
    }
}