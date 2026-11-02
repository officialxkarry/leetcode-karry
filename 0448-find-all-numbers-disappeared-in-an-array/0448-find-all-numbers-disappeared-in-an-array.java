class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums)
    {
        cyclicSort(nums);
        return findEle(nums);        
    }

    public static void cyclicSort(int[] arr)
    {
        int n = arr.length;
        int i = 0;
        while(i<n)
        {
            int correctIndex = arr[i] - 1;
            if(arr[i]!=arr[correctIndex])
            {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            else
            i++;
        }

    }
    public static List<Integer> findEle(int[] arr)
    {
        List<Integer> numpum = new ArrayList<>();
        int n = arr.length;
        for(int i=0 ; i<n ; i++)
        {
            if(arr[i]!=i+1)
            numpum.add(i+1);
        }
        return numpum;
    }
}