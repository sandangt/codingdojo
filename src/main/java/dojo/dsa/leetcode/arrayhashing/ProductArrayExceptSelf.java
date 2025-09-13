package dojo.dsa.leetcode.arrayhashing;

/**
 * medium
 * url: https://leetcode.com/problems/product-of-array-except-self
 */
public class ProductArrayExceptSelf {

    static int[] solution(int[] nums) {
        int leftToRight = 1, rightToLeft = 1;
        int[] answer = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            answer[i] = leftToRight;
            leftToRight *= nums[i];
        }
        for (int i=(nums.length - 1); i>=0; i--) {
            answer[i] *= rightToLeft;
            rightToLeft *= nums[i];
        }
        return answer;
    }

}
