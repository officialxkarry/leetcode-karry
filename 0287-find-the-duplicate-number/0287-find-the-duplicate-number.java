class Solution {
    public static void cyclicSort(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correctIdx = arr[i]-1;
            if(arr[i]!=arr[correctIdx])
            {
                int temp = arr[i];
                arr[i]=arr[correctIdx];
                arr[correctIdx]=temp;
            }
            else
                i++;

        }
    }
    public static int findEle(int[] nums)
    {
        int n = nums.length;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i]!=i+1)
            return nums[i];
        }
        return nums[n];
    }
    public int findDuplicate(int[] nums) 
    {
        cyclicSort(nums);
        return findEle(nums);
        
    }
}