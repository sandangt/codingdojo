package battleground.part2;

public class Test2 {
    public static int solution(int[] d, int x) {
        int result = 0; // days
        int currentMaxDiff, currentMinDiff;
        int newMissionIdx, currentMissionIdx = 0;
        while (currentMissionIdx < d.length) {
            currentMinDiff = d[currentMissionIdx];
            currentMaxDiff = d[currentMissionIdx];
            for (newMissionIdx=currentMissionIdx; newMissionIdx<d.length; newMissionIdx++) {
                currentMaxDiff = Math.max(currentMaxDiff, d[newMissionIdx]);
                currentMinDiff = Math.min(currentMinDiff, d[newMissionIdx]);
                if (currentMaxDiff - currentMinDiff > x) {
                    break;
                }
            }
            currentMissionIdx = newMissionIdx;
            result++;
        }
        return result;
    }
}
