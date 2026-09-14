// Last updated: 9/14/2026, 1:15:41 PM
class Solution {
    public int largestInteger(int n, int s) {
        if(s>9*n){
            return -1;
        }
        int r=0;
        for(int i=0;i<n;i++){
            int d=Math.min(9,s);
            r=r*10+d;
            s-=d;
        }
        return r;
    }
}