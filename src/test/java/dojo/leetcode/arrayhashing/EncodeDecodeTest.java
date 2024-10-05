package dojo.leetcode.arrayhashing;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class EncodeDecodeTest {

    @Test
    void testSolution1() {
        List<String> strs = List.of("neet","code","love","you");
        List<String> expected = List.of("neet","code","love","you");
        assertThat(EncodeDecode.decode(EncodeDecode.encode(strs))).isEqualTo(expected);
    }

    @Test
    void testSolution2() {
        List<String> strs = List.of("we","say",":","yes");
        List<String> expected = List.of("we","say",":","yes");
        assertThat(EncodeDecode.decode(EncodeDecode.encode(strs))).isEqualTo(expected);
    }

}
