class Solution {
    public char nextGreatestLetter(char[] letters, char target) 
    {
        int i=0;
        int min=i;
        int max=letters.length-1;
        while(min<=max)
        {
            int mid = min + (max-min)/2;
            // if(letters[mid]==target)
            // {
            //     return letters[mid+1];
            // }
            if(letters[mid]>target)
            {
                max=mid-1;
            }
            else
            {
                min=mid+1;
            }


        }
      return letters[(min%letters.length)];
        

        
    }
}