//LCP1344: https://leetcode.com/problems/angle-between-hands-of-a-clock/?envType=daily-question&envId=2026-06-18
class Solution {
    public double angleClock(int hour, int minutes) {
        double x = hour + minutes / 60.0;
        double diff = (11.0 * x) % 12.0;
        return Math.min(diff, 12.0 - diff) * 30.0;
    }

}
