// Last updated: 8/10/2026, 3:52:12 PM
import java.util.*;

class Solution {
    public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {
        Map<Integer, Integer> rows = new HashMap<>();
        Map<Integer, Integer> cols = new HashMap<>();
        Map<Long, Integer> diag = new HashMap<>();      // r - c
        Map<Long, Integer> antiDiag = new HashMap<>();  // r + c

        Set<Long> activeLamps = new HashSet<>();

        // Add lamps
        for (int[] lamp : lamps) {
            int r = lamp[0];
            int c = lamp[1];

            long key = ((long) r << 32) | (c & 0xffffffffL);

            if (activeLamps.contains(key)) {
                continue;
            }

            activeLamps.add(key);

            rows.put(r, rows.getOrDefault(r, 0) + 1);
            cols.put(c, cols.getOrDefault(c, 0) + 1);
            diag.put((long) r - c, diag.getOrDefault((long) r - c, 0) + 1);
            antiDiag.put((long) r + c, antiDiag.getOrDefault((long) r + c, 0) + 1);
        }

        int[] result = new int[queries.length];

        int[][] directions = {
            {-1, -1}, {-1, 0}, {-1, 1},
            { 0, -1}, { 0, 0}, { 0, 1},
            { 1, -1}, { 1, 0}, { 1, 1}
        };

        for (int i = 0; i < queries.length; i++) {
            int r = queries[i][0];
            int c = queries[i][1];

            // Check illumination
            if (rows.getOrDefault(r, 0) > 0 ||
                cols.getOrDefault(c, 0) > 0 ||
                diag.getOrDefault((long) r - c, 0) > 0 ||
                antiDiag.getOrDefault((long) r + c, 0) > 0) {
                result[i] = 1;
            }

            // Turn off lamps in the 3x3 area
            for (int[] dir : directions) {
                int nr = r + dir[0];
                int nc = c + dir[1];

                long key = ((long) nr << 32) | (nc & 0xffffffffL);

                if (!activeLamps.contains(key)) {
                    continue;
                }

                activeLamps.remove(key);

                rows.put(nr, rows.get(nr) - 1);
                cols.put(nc, cols.get(nc) - 1);
                diag.put((long) nr - nc, diag.get((long) nr - nc) - 1);
                antiDiag.put((long) nr + nc, antiDiag.get((long) nr + nc) - 1);
            }
        }

        return result;
    }
}