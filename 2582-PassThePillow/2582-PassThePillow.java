// Last updated: 9/14/2026, 1:16:47 PM
class Solution {
    public int passThePillow(int n, int time) {
         int cycle = 2 * (n - 1);
        int t = time % cycle;
        return(t<=n-1)?(1+t):(n-(t-(n-1)));
        }
    }

