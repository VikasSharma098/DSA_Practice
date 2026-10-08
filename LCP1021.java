//LCP1021: Remove Outermost Parentheses
//https://leetcode.com/problems/remove-outermost-parentheses/?envType=daily-question&envId=2026-10-08
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int x = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if ((c == '(' && x++ > 0) ||
                    (c == ')' && --x > 0))
                sb.append(c);

        }

        return sb.toString();
    }
}