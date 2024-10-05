package dojo.leetcode.twopointers;

import static dojo.leetcode.twopointers.ValidPalindrome.solution;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


public class ValidPalindromeTest {
    @Test
    public void testSolution0() {
        String input = "A man, a plan, a canal: Panama";
        assertThat(solution(input)).isTrue();
    }

    @Test
    public void testSolution1() {
        String input = " ";
        assertThat(solution(input)).isTrue();
    }

    @Test
    public void testSolution2() {
        String input = "race a car";
        assertThat(solution(input)).isFalse();
    }

    @Test
    public void testSolution3() {
        String input = "Was it a car or a cat I saw?";
        assertThat(solution(input)).isTrue();
    }

    @Test
    public void testSolution4() {
        String input = "tab a cat";
        assertThat(solution(input)).isFalse();
    }
}
