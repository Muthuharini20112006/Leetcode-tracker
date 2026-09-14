// Last updated: 9/14/2026, 1:22:45 PM
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[1]==b[1]? b[0]-a[0]:a[1]-b[1]);
        int c=0,end=Integer.MIN_VALUE;
        for(int[] ele: intervals){
            // ele start > end 
            if(ele[0]>=end)
            end = ele[1];
            //else count increment
            else c++;
        }
        return c;
    }
}