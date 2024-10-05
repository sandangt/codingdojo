package battleground.part2;

public class Test1 {

    private static final char POTHOLE_CHAR = 'X';
    private static final int PATCH_LENGTH = 3;

    public static int solution(String s) {
        int result = 0;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == POTHOLE_CHAR) {
                result++;
                i += PATCH_LENGTH;
                continue;
            }
            i++;
        }
        return result;
    }
}
