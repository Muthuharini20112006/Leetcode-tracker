// Last updated: 8/10/2026, 3:49:13 PM
class Solution {
    public int passThePillow(int n, int time) {
         int cycle = 2 * (n - 1);
        int t = time % cycle;
        return(t<=n-1)?(1+t):(n-(t-(n-1)));
        }
    }

