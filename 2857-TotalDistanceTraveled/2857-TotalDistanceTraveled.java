// Last updated: 8/10/2026, 3:48:47 PM
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