package dojo.dsa.leetcode.arrayhashing;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

class GroupAnagramsTest {

    private boolean arrayAnagram(String[] actual, String[] expected) {
        var set = Arrays.stream(expected).collect(Collectors.toSet());
        return Arrays.stream(actual).allMatch(set::contains);
    }

    private void validate(String[][] actual, String[][] expected) {
        var result = Arrays.stream(expected).anyMatch(e2 -> Arrays.stream(actual).anyMatch(e1 -> arrayAnagram(e1, e2)));
        assertThat(result).isTrue();
    }

    private static final Arguments[] testSolution = {
        Arguments.of(new String[] {"eat","tea","tan","ate","nat","bat"}, new String[][] {{"bat"}, {"nat", "tan"}, {"ate", "eat", "tea"}}),
        Arguments.of(new String[] {""}, new String[][] {{""}}),
        Arguments.of(new String[] {"a"}, new String[][] {{"a"}}),
        Arguments.of(new String[] {"act","pots","tops","cat","stop","hat"}, new String[][] {{"hat"}, {"act", "cat"}, {"stop", "pots", "tops"}}),
    };

    @ParameterizedTest
    @FieldSource
    void testSolution(String[] strs, String[][] expected) {
        validate(GroupAnagrams.solution(strs), expected);
    }

}
