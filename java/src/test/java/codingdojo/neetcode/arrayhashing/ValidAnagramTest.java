package codingdojo.neetcode.arrayhashing;

import static org.assertj.core.api.Assertions.assertThat;
import static codingdojo.neetcode.arrayhashing.ValidAnagram.solution;

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
}
