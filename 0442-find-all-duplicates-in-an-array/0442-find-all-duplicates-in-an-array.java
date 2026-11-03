import java.util.*;
class Solution {
    public static void cyclicSort(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int correctIdx = arr[i] - 1;
            if(arr[i]!=arr[correctIdx])
            {
                int temp = arr[i];
                arr[i] = arr[correctIdx];
                arr[correctIdx] = temp;
            } 
            else
                i++;

        }
    }

    public static List<Integer> findEle(int[] nums)
    {
        List<Integer> arr = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1)
                arr.add(nums[i]);
        }
        return arr;
    }

    public List<Integer> findDuplicates(int[] nums) {
        cyclicSort(nums);
        return findEle(nums);

    }
}