class Solution {
    public static void cyclicSort(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            // Correct position for arr[i] is arr[i] - 1
            int correctIdx = arr[i] - 1;

            // Check if arr[i] is in range [1, n] AND not already in its correct position
            if (arr[i] > 0 && arr[i] <= n && arr[i] != arr[correctIdx]) {
                // Swap arr[i] with arr[correctIdx]
                int temp = arr[i];
                arr[i] = arr[correctIdx];
                arr[correctIdx] = temp;
            } else {
                i++;
            }
        }
    }

    public static int findEle(int[] arr) {
        int n = arr.length;
        // Find first index where element doesn't match expected value (i + 1)
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        // If 1 to n are all present, the smallest missing positive is n + 1
        return n + 1;
    }

    public int firstMissingPositive(int[] arr) {
        cyclicSort(arr);
        return findEle(arr);
    }
}