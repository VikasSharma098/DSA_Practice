//LCP1189: Maximum Number of Balloons
//https://leetcode.com/problems/maximum-number-of-balloons/?envType=daily-question&envId=2026-06-22
class Solution {
    public int maxNumberOfBalloons(String s) {
        int[] x = new int[5];
        String t = "balon";

        for (int i = 0; i < s.length(); i++)
            for (int j = 0; j < 5; j++)
                if (s.charAt(i) == t.charAt(j))
                    x[j]++;

        x[2] >>= 1;
        x[3] >>= 1;

        return Arrays.stream(x).min().getAsInt();

    }
}