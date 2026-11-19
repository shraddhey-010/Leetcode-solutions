class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int minSum = Integer.MAX_VALUE;

        for (int k = l; k <= r; k++) {
            int windowSum = 0;

            for (int i = 0; i < k; i++) {
                windowSum += nums.get(i);
            }
            if (windowSum > 0) {
                minSum = Math.min(minSum, windowSum);
            }

            for (int i = k; i < n; i++) {
                windowSum += nums.get(i) - nums.get(i - k);
                if (windowSum > 0) {
                    minSum = Math.min(minSum, windowSum);
                }
            }
        }

        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }
}