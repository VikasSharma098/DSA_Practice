//LCP1833: Maximum Ice Cream Bars
//https://leetcode.com/problems/maximum-ice-cream-bars/?envType=daily-question&envId=2026-06-21
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int sum = 0;
        for (int i : costs) {
            if (coins < i)
                break;
            sum++;
            coins -= i;

        }
        return sum;
    }
}