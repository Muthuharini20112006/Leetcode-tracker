// Last updated: 9/14/2026, 1:18:08 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int empty=0;
        int drank=0;
        while(numBottles>0){
            numBottles--;
            drank++;
            empty++;
         if(empty==numExchange){
            numBottles++;
            empty=0;
         }   
        }
        return drank;
        
    }
}