// Last updated: 8/10/2026, 3:51:08 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int p=1;
         int sum=0;
        while(n>0){
            int d=n%10;
            p=p*d;
            sum=sum+d;
            n=n/10;
        }
        return p-sum;


        
    }
}