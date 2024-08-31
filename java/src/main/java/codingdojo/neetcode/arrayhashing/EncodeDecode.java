package codingdojo.neetcode.arrayhashing;

import java.util.List;

/**
 * medium
 * url: https://neetcode.io/problems/string-encode-and-decode
 */
public class EncodeDecode {

    private static final String SEPERATOR = "<sandang>";

    static String encode(List<String> strs) {
        return String.join(SEPERATOR, strs);
    }

    static List<String> decode(String str) {
        return List.of(str.split(SEPERATOR));
    }
}
