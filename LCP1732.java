//LCP1732: Find the Highest Altitude
//https://leetcode.com/problems/find-the-highest-altitude/?envType=daily-question&envId=2026-06-19
class Solution {
    public int largestAltitude(int[] gain) {
        int x = 0;

        int peak = x;

        for (int altitudeGain : gain) {

            x += altitudeGain;

            peak = Math.max(peak, x);
        }

        return peak;

    }
}