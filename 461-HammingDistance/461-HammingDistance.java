// Last updated: 9/14/2026, 1:22:30 PM
class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int count = 0;

        while (xor > 0) {
            count += xor % 2;
            xor /= 2;
        }

        return count;
    }
}