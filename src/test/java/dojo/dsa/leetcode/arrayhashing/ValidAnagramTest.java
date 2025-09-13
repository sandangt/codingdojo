package dojo.dsa.leetcode.arrayhashing;

import static org.assertj.core.api.Assertions.assertThat;
import static dojo.dsa.leetcode.arrayhashing.ValidAnagram.solution;

import org.junit.jupiter.api.Test;


class ValidAnagramTest {
    @Test
    void testSolution0() {
        assertThat(solution("anagram", "nagaram")).isTrue();
    }

    @Test
    void testSolution1() {
        assertThat(solution("rat", "car")).isFalse();
    }

    @Test
    void testSolution2() {
        assertThat(solution("racecar", "carrace")).isTrue();
    }

    @Test
    void testSolution3() {
        assertThat(solution("jar", "jam")).isFalse();
    }
}
