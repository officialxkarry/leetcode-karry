class Solution {
    public static void cyclicSort(int[] arr)
    {
        int n = arr.length;
        int i = 0;
        while(i<n)
        {
            if(arr[i] < n && arr[i]!=i)
            {
                int temp = arr[i];
                arr[i] = arr[temp];
                arr[temp] = temp;
            }
            else
            i++;
        }

    }
    public static int findEle(int[] arr)
    {
        int n = arr.length;
        for(int i=0 ; i<n ; i++)
        {
            if(arr[i]!=i)
            return i;
        }
        return n;
    }
    public int missingNumber(int[] arr) 
    {
        cyclicSort(arr);
        return findEle(arr);
    }
}