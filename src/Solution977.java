import java.util.*;

public class Solution977 {
    /*public static int[] sortedSquares(int[] nums) {
        for (int i = 0, j = nums.length; i < nums.length - 1; i++) {}
        int[] negatives;
        int[] positives;
        int negativesCount = 0;
        int positivesCount = 0;
        for (int num: nums) {
            if (num < 0) {
                negativesCount++;
            }
        }

        Map<Integer, Integer> map = new HashMap<>();
        Collection<Integer>
        negatives = new int[negativesCount];
        positives = new int[nums.length - negativesCount];
        String s = "jsgjs";
        HashSet<Integer> set = new HashSet<>(negatives);
        s.

        for (int i = negativesCount - 1, j = 0; i >=0; i--, j++) {
            negatives[j] = nums[i] * nums[i];
        }
        for (int i = negativesCount, j = 0; i < nums.length; i++, j++) {
            positives[j] = nums[i] * nums[i];
        }

        int[] result = new int[nums.length];
        int resultIdx;
        negativesCount = 0;
        for (resultIdx = 0; resultIdx < nums.length; resultIdx++) {

            if (negatives[negativesCount] <= positives[positivesCount]) {
                result[resultIdx] = negatives[negativesCount];
                negativesCount++;
            } else {
                result[resultIdx] = positives[positivesCount];
                positivesCount++;
            }
            if (negativesCount == negatives.length || positivesCount == positives.length) {
                resultIdx++;
                break;
            }
        }
        for (int i = negativesCount; i < negatives.length; i++) {
            result[resultIdx] = negatives[negativesCount];
            resultIdx++;
        }
        for (int i = positivesCount; i < positives.length; i++) {
            result[resultIdx] = positives[positivesCount];
            resultIdx++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("args = " + Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3, 10})));
    }*/
}