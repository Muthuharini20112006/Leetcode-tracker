// Last updated: 9/14/2026, 1:22:23 PM
class Solution {
    public String smallestGoodBase(String n) {
         long num = Long.parseLong(n);

        for (int m = 60; m >= 2; m--) {
            long k = (long) Math.pow(num, 1.0 / (m - 1));

            if (k < 2) continue;

            long sum = 1;
            long term = 1;

            for (int i = 1; i < m; i++) {
                term *= k;
                sum += term;

                if (sum > num) break;
            }

            if (sum == num)
                return String.valueOf(k);
        }

        return String.valueOf(num - 1);
    }
}