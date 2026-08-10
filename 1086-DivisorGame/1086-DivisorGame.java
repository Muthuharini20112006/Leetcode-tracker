// Last updated: 8/10/2026, 3:52:09 PM
class Solution {
    public boolean divisorGame(int n) {
        int x=0,i;
        for (i = 0; i < n; i++) {
            n=n-x;
            if (n % 2 == 0) {
                return true;
            } else
            return false;

        }return false;
    }
}