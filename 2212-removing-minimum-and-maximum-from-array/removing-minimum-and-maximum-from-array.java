class Solution {
    public int minimumDeletions(int[] nums) {

        int n = nums.length;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int idxMin = -1;
        int idxMax = -1;

        for (int i = 0; i < n; i++) {

            if (nums[i] < min) {
                min = nums[i];
                idxMin = i;
            }

            if (nums[i] > max) {
                max = nums[i];
                idxMax = i;
            }
        }

        // Both removed from the left
        int left = Math.max(idxMin, idxMax) + 1;

        // Both removed from the right
        int right = n - Math.min(idxMin, idxMax);

        // Min from left, Max from right
        int mixed1 = idxMin + 1 + (n - idxMax);

        // Max from left, Min from right
        int mixed2 = idxMax + 1 + (n - idxMin);

        return Math.min(
            Math.min(left, right),
            Math.min(mixed1, mixed2)
        );
    }
}