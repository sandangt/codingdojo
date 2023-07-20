package codingdojo.neetcode.arrays_n_string;

import static org.assertj.core.api.Assertions.assertThat;
import static codingdojo.neetcode.arrays_n_string.ValidAnagram.solution;

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
