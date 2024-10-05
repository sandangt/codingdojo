package dojo.leetcode.arrayhashing;


/**
 * easy
 * url: https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
 */
public class ReplaceWithGreatestOnRightSide {
    static int[] solution(int[] arr) {
        int currentMax = -1, temp;
        for (int i = arr.length - 1; i >= 0; i--) {
            temp = arr[i];
            arr[i] = currentMax;
            currentMax = Math.max(currentMax, temp);
        }
        return arr;
    }
}
