class Solution {
    public int numberOfSteps(int num) {
        return sideChick(num,0);
    }

    public int sideChick(int num, int step) {
        if (num == 0)
        {
            return step;
        }

        if (num % 2 == 0) {
            step = step + 1;
            return sideChick(num / 2,step);
        }
        else
        {
            step = step + 1;
            return sideChick(num - 1,step);
        }
    }
}