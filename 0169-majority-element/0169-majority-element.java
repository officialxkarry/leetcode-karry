class Solution {
    //By -----> Boyre-Moore Majority Voting Element Algorithm
    public int majorityElement(int[] nums)
    {
        int n = nums.length;
        int count = 0;
        int candi=0;
        for(int num : nums)
        {
            if(count==0)
            {
                candi=num;
            }
            if(num==candi)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
    return candi;
    }
}