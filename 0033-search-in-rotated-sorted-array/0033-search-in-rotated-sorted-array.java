public class Solution{
    public static void main(String[] args){
        int[] arr = {4,5,6,7,8,0,1,2,3};
        System.out.print(search(arr,4)); 
    }
    public static int search(int[] arr,int target){
        return helper(arr,target,0,arr.length-1);
    }
    public static int helper(int arr[],int target,int low,int high){
        if(low>high){
            return -1;
        }
        int mid = low + (high-low)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[low]<=arr[mid])
        {
            if(target>=arr[low] && target<=arr[mid])
            {
                return helper(arr,target,low,mid-1);
            }
            else
            {
                return helper(arr,target,mid+1,high);
            }
        }
        if(target>=arr[mid] && target<=arr[high])
        {
            return helper(arr,target,mid+1,high);   
        }
        return helper(arr,target,low,mid-1);
    }
}