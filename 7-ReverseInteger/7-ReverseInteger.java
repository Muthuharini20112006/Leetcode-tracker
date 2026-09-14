// Last updated: 9/14/2026, 1:28:43 PM
class Solution {
    public int reverse(int x) {
        int rev = 0;
        
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            
           
            if (rev > 214748364 || rev < -214748364) {
                return 0;
            }
            
            rev = rev * 10 + digit;
        }
        
        return rev;
    }
}