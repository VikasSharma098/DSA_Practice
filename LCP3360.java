//LCP3360: Stone Removal Game
//https://leetcode.com/problems/stone-removal-game/?envType=daily-question&envId=2026-11-26
class Solution {
    public boolean canAliceWin(int n) {
        int x = 10,
                k = 0;
        while (n >= x) {
            n -= x;
            x--;
            k++;
        }
        return k % 2 == 1;
    }
}