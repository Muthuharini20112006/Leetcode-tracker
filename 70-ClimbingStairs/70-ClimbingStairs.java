// Last updated: 9/14/2026, 1:27:12 PM
class Solution {
    public int climbStairs(int n) {
        if(n<=2)
        return n;
         int n1=1;
         int n2=2;
         for(int i=3;i<=n;i++){
            int c=n1+n2;
            n1=n2;
            n2=c;
         }
        return n2;
    }
}