class Solution {
    public static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIdx = arr[i] - 1;
            if (arr[i] != arr[correctIdx]) {
                int temp = arr[i];
                arr[i] = arr[correctIdx];
                arr[correctIdx] = temp;
            } else
                i++;
        }
    }

    public static int[] findEles(int[] nums) {
        int k = 0;
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return new int[] { nums[i], i + 1 };
            }
        }
        return arr;

    }

    public int[] findErrorNums(int[] nums) {
        cyclicSort(nums);
        return findEles(nums);

    }
}
