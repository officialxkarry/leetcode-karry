import java.util.*;
class Solution {
    public static void bubbleSort(int[] arr)
    {
         Arrays.sort(arr);
    }
    public static boolean findEle(int[] nums)
    {
        for(int i = 0 ; i < nums.length-1; i++)
        {
            if(nums[i+1]==nums[i])
            {
                return true;
            }
        }
        return false;
    }
    public boolean containsDuplicate(int[] nums)
    {
        bubbleSort(nums);
        return findEle(nums);
        
    }
}