// Last updated: 8/10/2026, 3:49:28 PM
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