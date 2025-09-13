package dojo.dsa.leetcode.arrayhashing;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class GroupAnagramsTest {

    private boolean arrayAnagram(List<String> actual, List<String> expected) {
        return actual.containsAll(expected);
    }

    private void validate(List<List<String>> actual, List<List<String>> expected) {
        var result = expected.stream().anyMatch(e2 -> actual.stream().anyMatch(e1 -> arrayAnagram(e1, e2)));
        assertThat(result).isTrue();
    }

    @Test
    void testSolution0() {
        String[] strs = new String[] {"eat","tea","tan","ate","nat","bat"};
        var expected = List.of(
            List.of("bat"),
            List.of("nat", "tan"),
            List.of("ate", "eat", "tea")
        );
        validate(GroupAnagrams.solution(strs), expected);
    }

    @Test
    void testSolution1() {
        String[] strs = new String[] {""};
        List<List<String>> expected = List.of(List.of(""));
        validate(GroupAnagrams.solution(strs), expected);
    }

    @Test
    void testSolution2() {
        String[] strs = {"a"};
        List<List<String>> expected = List.of(List.of("a"));
        validate(GroupAnagrams.solution(strs), expected);
    }

    @Test
    void testSolution3() {
        String[] strs = {"act","pots","tops","cat","stop","hat"};
        List<List<String>> expected = List.of(
            List.of("hat"), List.of("act", "cat"), List.of("stop", "pots", "tops"));
        validate(GroupAnagrams.solution(strs), expected);
    }

    @Test
    void testSolution4() {
        String[] strs = new String[] {"act","pots","tops","cat","stop","hat"};
        var expected = List.of(
            List.of("hat"),
            List.of("act", "cat"),
            List.of("stop", "pots", "tops")
        );
        validate(GroupAnagrams.solution(strs), expected);
    }

}
