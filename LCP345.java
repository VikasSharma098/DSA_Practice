//LCP345: https://leetcode.com/problems/reverse-vowels-of-a-string/
class Solution {
    public String reverseVowels(String s) {
        char[] w = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        String vowels = "aeiouAEIOU";

        while (start < end) {
            while (start < end && vowels.indexOf(w[start]) == -1) {
                start++;
            }
            while (start < end && vowels.indexOf(w[end]) == -1) {
                end--;
            }

            char t = w[start];
            w[start] = w[end];
            w[end] = t;

            start++;
            end--;
        }

        return new String(w);

    }
}