//LCP1614: Maximum Nesting Depth of the Parentheses
//https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/?envType=daily-question&envId=2026-09-28
class Solution {
    public int maxDepth(String s) {
        int ans = 0, depth = 0;
        for (char ch : s.toCharArray()) {
            depth += ch == '(' ? 1 : ch == ')' ? -1 : 0;
            ans = Math.max(ans, depth);
        }
        return ans;
    }
}