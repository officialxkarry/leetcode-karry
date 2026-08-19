class Solution {
    public int[] moveZeroes(int[] nums)
    {
        int lastNonZeroFoundAt=0;

        // Move all non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt]=temp;
                lastNonZeroFoundAt++;
            }
        }

        return nums;
    

// Recusion call -------> return moveZero(nums,0);
//Using 2 For Loops;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==0)
        //     {
        //         for(int j=i+1;j<nums.length;j++)
        //         {
        //             if(nums[j]!=0)
        //             {
        //                 int temp=nums[i];
        //                 nums[i]=nums[j];
        //                 nums[j]=temp;
        //                 break;
        //             }
        //         }   
        //     }
        // }
        // return nums;
    }
//Using Recursion;
    // public static int[] moveZero(int[] nums,int idx)
    // {
    //     if(idx==nums.length)
    //     {
    //         return nums;
    //     }
    //     if(nums[idx]==0)
    //     {
    //         for(int j=idx+1;j<nums.length;j++)
    //         {
    //             if(nums[j]!=0)
    //             {
    //                 nums[idx]=nums[idx]^nums[j];
    //                 nums[j]=nums[idx]^nums[j];
    //                 nums[idx]=nums[idx]^nums[j];
    //                 break;
    //             }
    //         }
    //     }
    //     return moveZero(nums,idx+1);
    // }
}