// Last updated: 8/10/2026, 3:51:30 PM
class Solution {
    public int dayOfYear(String date) {
        String[] arr = date.split("-");

        int year = Integer.parseInt(arr[0]);
        int month = Integer.parseInt(arr[1]);
        int day = Integer.parseInt(arr[2]);

        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

        // Check leap year
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            days[1] = 29;
        }

        int total = day;

        for (int i = 0; i < month - 1; i++) {
            total += days[i];
        }

        return total;
    }
}