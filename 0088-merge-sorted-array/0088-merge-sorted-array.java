import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n)
    {
        // for(int i=0;i<n;i++)
        // {
        //     nums1[m+i]=nums2[i];
        // }
        // Arrays.sort(nums1);
        helper(nums1,m,nums2,n,0);
        return;
    }
    public void helper(int[] nums1,int m, int[] nums2 , int n , int idx){
        if(idx==n)
        {   
            Arrays.sort(nums1);
            return;
        }
        nums1[m+idx]=nums2[idx];
        helper(nums1,m,nums2,n,idx+1);
    }
}