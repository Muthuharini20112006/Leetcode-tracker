// Last updated: 8/10/2026, 3:50:35 PM
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