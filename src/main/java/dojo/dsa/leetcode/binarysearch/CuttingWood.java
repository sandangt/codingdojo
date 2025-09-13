package dojo.dsa.leetcode.binarysearch;

/**
 * medium
 * url: https://bytebytego.com/exercises/coding-patterns/binary-search/cutting-wood
 */
public class CuttingWood {

    public static int solution(int[] heights, int k) {
        int max_height = 0;
        for (int height : heights) {
            max_height = Math.max(max_height, height);
        }

        int low = 0;
        int high = max_height;
        int result = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long wood_collected = 0;

            for (int height : heights) {
                if (height > mid) {
                    wood_collected += (long) (height - mid);
                }
            }

            if (wood_collected >= k) {
                // mid is a possible solution, but we might find a higher one
                result = mid;
                low = mid + 1;
            } else {
                // mid is too high, we need to get less wood
                high = mid - 1;
            }
        }
        return result;
    }

}
