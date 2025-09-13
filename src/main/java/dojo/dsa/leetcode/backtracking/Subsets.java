package dojo.dsa.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Subsets {
    static List<List<Integer>> solution(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        backtrackFunc(nums, result, 0, st);
        return result;
    }

    private static void backtrackFunc(int[] nums,
                                      List<List<Integer>> result,
                                      int startingPoint,
                                      Stack<Integer> helperStack) {
        if (startingPoint >= nums.length) {
            result.add(new ArrayList<>(helperStack));
        } else {
            helperStack.push(nums[startingPoint]);
            backtrackFunc(nums, result, startingPoint+1, helperStack);
            helperStack.pop();
            backtrackFunc(nums, result, startingPoint+1, helperStack);
        }
    }
}
