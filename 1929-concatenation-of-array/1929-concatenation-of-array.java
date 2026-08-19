class Solution {
    public int[] getConcatenation(int[] nums) 
    {
        int n=nums.length;
        int[] ans = new int[2*n];
        return concat(nums,ans,0,n);
    }
    public static int[] concat(int[] nums,int[] ans,int idx,int n){
        if(idx==n)
        {
            return ans;
        }
        ans[idx]=nums[idx];
        ans[idx+n]=nums[idx];
        return concat(nums,ans,idx+1,n);
    }
}
//brute-Force
// class Solution {
//     public int[] getConcatenation(int[] nums) 
//     {
//         int n=nums.length;
//         int[] ans = new int[2*n];
//         for(int i=0;i<n;i++){
//             ans[i]=nums[i];
//             ans[i+n]=nums[i];
//         }
//         return ans;
        
//     }
// }