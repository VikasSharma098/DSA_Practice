//LCP520: Detect Capital
//https://leetcode.com/problems/detect-capital/
class Solution {
    public boolean detectCapitalUse(String word) {
        int uppercase = 0;

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                uppercase++;
            }
        }

        return uppercase == word.length()
                || uppercase == 0
                || (uppercase == 1 && Character.isUpperCase(word.charAt(0)));
    }
}