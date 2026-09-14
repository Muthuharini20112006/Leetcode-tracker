// Last updated: 9/14/2026, 1:16:35 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
       return (arrivalTime+delayedTime)%24;
    }
}