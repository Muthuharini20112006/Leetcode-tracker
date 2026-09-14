// Last updated: 9/14/2026, 1:22:13 PM
class Solution {
    public boolean checkPerfectNumber(int num) {
        int i,sum=0;
		for(i=1; i<=num/2; i++) {
			if(num%i==0)
				sum+=i;
		}
		if(sum==num) {
			return true;
		}
		else 
			return false;
	}
    }