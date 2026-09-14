// Last updated: 9/14/2026, 1:17:02 PM
class Solution {
    public int commonFactors(int a, int b) {
        int count=0;
        int limit=a<b?a:b;

		for( int i=1; i<=limit; i++) {
			if(a%i==0 && b%i==0)
            {
				count++;
    }
        }
    return count;
}
}