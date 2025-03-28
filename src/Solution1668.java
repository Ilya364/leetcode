import java.util.Arrays;

public class Solution1668 {
    public static int maxRepeating(String sequence, String word) {
        int result = 0;
        int curRep = 0;
        int i = 0;
        if (sequence.equals(word)) {
            return 1;
        }
        while (i <= sequence.length() - word.length()) {
            if (sequence.substring(i, i + word.length()).equals(word)) {
                i += word.length();
                curRep++;
                if (curRep > result) {
                    result = curRep;
                }
            } else if (curRep > 0) {
                curRep = 0;
                i -= word.length() - 1;
            } else {
                i++;
            }
        }
        Arrays.
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[3];
        System.out.println(Arrays.toString(nums));
    }
}
