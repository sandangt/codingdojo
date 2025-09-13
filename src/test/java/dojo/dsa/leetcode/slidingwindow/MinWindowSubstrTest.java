package dojo.dsa.leetcode.slidingwindow;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class MinWindowSubstrTest {

    @ParameterizedTest
    @CsvSource({
        "ADOBECODEBANC,ABC,BANC",
        "a,a,a",
        "a,aa,''",
        "cabwefgcdbag,cda,cdba",
        "ab,b,b",
        "ADOBECODEBANC,AABC,ADOBECODEBA",
        "abc,cba,abc",
        "AaBbCc,abc,aBbCc",
        "abcdef,cf,cdef",
        "AABBCCDDEFFGGHH,ABCF,ABBCCDDEF"
    })
    void testSolution(String s, String t, String expected) {
        assertThat(MinWindowSubstr.solution(s,t))
            .isEqualTo(expected);
    }

}
