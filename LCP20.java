//LCP20: Valid Parentheses
//https://leetcode.com/problems/valid-parentheses/?envType=daily-question&envId=2026-10-01
class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = -1;

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack[++top] = c;
            } else {
                if (top == -1 ||
                    (c == ')' && stack[top] != '(') ||
                    (c == '}' && stack[top] != '{') ||
                    (c == ']' && stack[top] != '[')) {
                    return false;
                }
                top--;
            }
        }

        return top == -1;
    }
}