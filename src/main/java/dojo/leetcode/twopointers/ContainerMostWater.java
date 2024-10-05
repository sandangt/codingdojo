package dojo.leetcode.twopointers;

/**
 * medium
 * url: https://leetcode.com/problems/container-with-most-water/
 */
public class ContainerMostWater {
    static int solution(int[] height) {
        int left = 0, right = height.length - 1;
        int result = 0, width;

        while (left < right) {
            width = right - left;
            result = Math.max(result, width * Math.min(height[left], height[right]));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}
