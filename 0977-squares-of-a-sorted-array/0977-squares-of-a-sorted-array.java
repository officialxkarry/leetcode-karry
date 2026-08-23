import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums)
    {
           return squaring(nums,0);
    }
    public static int[] squaring(int[] arr,int idx){
        if(idx==arr.length)
        {
            Arrays.sort(arr);
            return arr;
        }
        arr[idx]=arr[idx]*arr[idx];
        return squaring(arr,idx+1);
    }
}