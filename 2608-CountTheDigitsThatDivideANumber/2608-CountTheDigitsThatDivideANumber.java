// Last updated: 8/10/2026, 3:49:18 PM
class Solution {
    public int countDigits(int num) {
        int n = num;
        int count = 0;

        while (n > 0) {
            int digit = n % 10;

            if (num % digit == 0) {
                count++;
            }

            n /= 10;
        }

        return count;
    }
}