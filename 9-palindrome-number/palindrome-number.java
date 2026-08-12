class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int divisor = 1;

        // Find highest place value
        while (x / divisor >= 10) {
            divisor *= 10;
        }

        while (x != 0) {

            int first = x / divisor;
            int last = x % 10;

            if (first != last) {
                return false;
            }

            // Remove first digit
            x = x % divisor;

            // Remove last digit
            x = x / 10;

            // Move divisor two positions
            divisor /= 100;
        }

        return true;
    }
}