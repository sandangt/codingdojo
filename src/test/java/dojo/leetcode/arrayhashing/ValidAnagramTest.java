package dojo.leetcode.arrayhashing;

import static org.assertj.core.api.Assertions.assertThat;
import static dojo.leetcode.arrayhashing.ValidAnagram.solution;

import org.junit.jupiter.api.Test;


public class ValidAnagramTest {
    @Test
    public void testSolution0() {
        assertThat(solution("anagram", "nagaram")).isTrue();
    }

    @Test
    public void testSolution1() {
        assertThat(solution("rat", "car")).isFalse();
    }

    @Test
    public void testSolution2() {
        assertThat(solution("racecar", "carrace")).isTrue();
    }

    @Test
    public void testSolution3() {
        assertThat(solution("jar", "jam")).isFalse();
    }
}
