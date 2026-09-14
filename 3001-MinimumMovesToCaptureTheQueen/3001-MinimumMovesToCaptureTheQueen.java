// Last updated: 9/14/2026, 1:16:05 PM
class Solution {
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {

        // Rook can capture queen
        if (a == e) {
            if (!(c == a && d > Math.min(b, f) && d < Math.max(b, f))) {
                return 1;
            }
        }

        if (b == f) {
            if (!(d == b && c > Math.min(a, e) && c < Math.max(a, e))) {
                return 1;
            }
        }

        // Bishop can capture queen
        if (Math.abs(c - e) == Math.abs(d - f)) {
            if (!(Math.abs(a - e) == Math.abs(b - f) &&
                  a > Math.min(c, e) && a < Math.max(c, e) &&
                  b > Math.min(d, f) && b < Math.max(d, f))) {
                return 1;
            }
        }

        return 2;
    }
}