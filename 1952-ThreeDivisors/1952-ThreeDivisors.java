// Last updated: 9/14/2026, 1:17:29 PM
class Solution {
    public boolean isThree(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) {
                if (i < 2) return false;
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) return false;
                }
                return true;
            }
        }
        return false;
    }
}
