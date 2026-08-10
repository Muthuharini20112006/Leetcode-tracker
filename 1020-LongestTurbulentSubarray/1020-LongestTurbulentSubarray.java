// Last updated: 8/10/2026, 3:52:20 PM
 class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int n = arr.length;

        if (n == 1)
            return 1;

        int max = 1;
        int curr = 1;

        for (int i = 1; i < n; i++) {

            if ((i >= 2 &&
                ((arr[i] > arr[i - 1] && arr[i - 1] < arr[i - 2]) ||
                 (arr[i] < arr[i - 1] && arr[i - 1] > arr[i - 2])))) {

                curr++;
            }
            else if (arr[i] != arr[i - 1]) {
                curr = 2;
            }
            else {
                curr = 1;
            }

            max = Math.max(max, curr);
        }

        return max;
    }
}