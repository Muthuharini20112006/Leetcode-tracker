// Last updated: 8/10/2026, 3:49:21 PM
class Solution {
    public int numberOfCuts(int n) {
        if(n==2)
        return 1;
        else if(n==1)
        return 0;
        else if (n%2==0)
        return n/2;
        else 
        return n;
    }
}