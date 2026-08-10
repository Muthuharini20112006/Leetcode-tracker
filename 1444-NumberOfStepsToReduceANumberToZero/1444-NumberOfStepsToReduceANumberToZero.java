// Last updated: 8/10/2026, 3:50:58 PM
class Solution {
    public int numberOfSteps(int num) 
    {
        int s=0;
        while(num>0)
        {
            if(num%2==0)
        {
            num=num/2;
        }
        else{
            num=num-1;
         }
            s++;
        }
        return s;
    }
}