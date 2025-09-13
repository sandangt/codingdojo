package dojo.dsa.leetcode.binarysearch;

/**
 * medium
 * url: https://leetcode.com/problems/koko-eating-bananas
 */
public class KokoEatingBananas {

    public static int solution(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        int result = high; // Initializing with a safe upper bound

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long time_taken = 0;

            for (int pile : piles) {
                time_taken += (long) (pile + mid - 1) / mid;
            }

            if (time_taken <= h) {
                // mid is a possible solution, but we might find a smaller one
                result = mid;
                high = mid - 1;
            } else {
                // mid is too slow, we need to increase the speed
                low = mid + 1;
            }
        }
        return result;
    }

}
