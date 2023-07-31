package codingdojo.neetcode.twopointers;

import static codingdojo.neetcode.twopointers.ValidPalindrome.solution;
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
}
