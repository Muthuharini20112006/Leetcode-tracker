// Last updated: 9/14/2026, 1:28:39 PM
class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int ans=0;
        if(x>0){
        while(x!=0){
             int d=x%10;
            ans=ans*10+d;
            x=x/10;
        }
        }
        if(temp==ans){
            return true;
        }
        else
        return false;


    }
}