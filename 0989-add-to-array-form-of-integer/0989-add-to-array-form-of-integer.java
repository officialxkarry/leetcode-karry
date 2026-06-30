import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int i = num.length - 1;

        // Loop as long as we have digits in the array OR we still have a value in k to add
        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i]; // Add the current digit to k
                i--;
            }
            
            result.add(k % 10); // Get the last digit of our current sum
            k /= 10;            // Carry the rest over to the next column
        }

        // Since we added digits from right to left, the list is backwards
        Collections.reverse(result);
        return result;
    }
}