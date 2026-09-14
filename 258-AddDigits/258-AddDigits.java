// Last updated: 9/14/2026, 1:24:06 PM
class Solution {
    public int addDigits(int num) {
        while(num>9){
        int sum=0;
        while(num!=0){
         int d=num%10;
            sum=sum+d;
            num=num/10;
        } 
        num=sum;
        }
        return num;
    }
}