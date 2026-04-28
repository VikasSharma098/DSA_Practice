class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int x = 0;
        x += numBottles;
        while (numBottles >= numExchange) {
            x += numBottles / numExchange;
            numBottles = (numBottles % numExchange) + numBottles / numExchange;

        }
        return x;

    }
}