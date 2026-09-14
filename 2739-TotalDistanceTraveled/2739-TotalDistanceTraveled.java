// Last updated: 9/14/2026, 1:16:23 PM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
     int distance =0;
     int used=0;
     while(mainTank>0){
        mainTank--;
        used++;
        distance+=10;
        if(used%5==0 && additionalTank>0){
            mainTank++;
            additionalTank--;
        }

     } 
     return distance;  
    }
}