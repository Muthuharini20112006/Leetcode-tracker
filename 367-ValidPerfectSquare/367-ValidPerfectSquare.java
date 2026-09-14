// Last updated: 9/14/2026, 1:23:18 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        long i = 1;

        while (i * i < num) {
            i++;
        }

        return i * i == num;
    }
}