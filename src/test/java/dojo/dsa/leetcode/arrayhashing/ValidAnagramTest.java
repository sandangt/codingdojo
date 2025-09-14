package dojo.dsa.leetcode.arrayhashing;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class ValidAnagramTest {

    @ParameterizedTest
    @CsvSource({
        "anagram,nagaram,true", "rat,car,false", "racecar,carrace,true", "jar,jam,false"
    })
    void testSolution(String s, String t, boolean expected) {
        assertThat(ValidAnagram.solution(s, t)).isEqualTo(expected);
    }

}
