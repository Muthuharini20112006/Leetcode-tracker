// Last updated: 9/14/2026, 1:23:25 PM
class Solution {
    public boolean isPowerOfFour(int n) {

       if(n<1)
        return false;
        while(n%4==0){
          n=n/4;
}
        if(n==1)
        return true;
        else 
       return false;        
    }
}