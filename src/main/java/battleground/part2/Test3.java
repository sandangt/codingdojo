package battleground.part2;

public class Test3 {
    private static final char START_LOWER_CHAR = 'a';
    public static int solution(String s) {
        int result = 1;
        boolean[] seenCharArr = new boolean[26];
        int currentCharIdx;
        int j = 0;
        for (int i=0; i<s.length(); i++) {
            currentCharIdx = s.charAt(i) - START_LOWER_CHAR;
            if (seenCharArr[currentCharIdx]) {
                result++;
                for (int k=j; k<i; k++) {
                    seenCharArr[s.charAt(k) - START_LOWER_CHAR] = false;
                }
                j = i;
            }
            seenCharArr[currentCharIdx] = true;
        }
        return result;
    }
}
