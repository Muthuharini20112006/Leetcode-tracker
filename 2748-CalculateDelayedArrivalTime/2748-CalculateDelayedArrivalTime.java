// Last updated: 8/10/2026, 3:49:01 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
       return (arrivalTime+delayedTime)%24;
    }
}