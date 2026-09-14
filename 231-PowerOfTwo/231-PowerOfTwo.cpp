// Last updated: 9/14/2026, 1:24:30 PM
class Solution {
public:
    bool isPowerOfTwo(int n) {

        if(n<1)
        return false;
        while(n%2==0){
            n=n/2;
        }
        if(n==1)
        return true;
        else 
        return false;        
    }
};