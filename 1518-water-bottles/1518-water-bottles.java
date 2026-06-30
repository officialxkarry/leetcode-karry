class Solution {
    public int numWaterBottles(int numBottles, int numExchange) 
    {
        int dBottles = numBottles;
        int empty = numBottles;
        int refilled;

       while(empty>=numExchange)
       {
            refilled = empty/numExchange;   //3 refilled
            empty=empty%numExchange;    //0=0+0
            dBottles=dBottles+refilled;
            empty=empty+refilled;

       }
        
        return dBottles;
    }
}