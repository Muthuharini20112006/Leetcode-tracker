// Last updated: 9/14/2026, 1:25:06 PM
class Solution {
    public int hammingWeight(int n) {
        int c=0;
        while(n!=0){

            n=n&n-1;
            c++;
        }
        return c;
        
    }
}