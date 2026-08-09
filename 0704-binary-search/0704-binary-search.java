class Solution {
    public int search(int[] nums, int target) {
        // Driver method calling the recursive helper
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    private int binarySearch(int[] nums, int low, int high, int target) {
        // 1. Base case check first
        if (low > high) {
            return -1;
        }

        // 2. Safe mid calculation
        int mid = low + (high - low) / 2;

        // 3. Search logic
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return binarySearch(nums, low, mid - 1, target);
        } else {
            return binarySearch(nums, mid + 1, high, target);
        }
    }
}