public class LongestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        int result = 0;
        int aux = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i - 1] >= nums[i]) {
                aux = i;
            }
            result = Math.max(result, (i - aux + 1));
        }
        return result;
    }
}
