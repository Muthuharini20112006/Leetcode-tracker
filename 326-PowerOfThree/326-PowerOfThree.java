// Last updated: 9/14/2026, 1:23:35 PM
class Solution {
    public boolean isPowerOfThree(int n) {
       if(n<1)
        return false;
        while(n%3==0){
          n=n/3;
}
        if(n==1)
        return true;
        else 
       return false;        
    }
}