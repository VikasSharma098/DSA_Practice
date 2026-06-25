//LCP387: First Unique Character in a String
//https://leetcode.com/problems/first-unique-character-in-a-string/
class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> x = new HashMap<>();

        for (char c : s.toCharArray()) {
            x.put(c, x.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (x.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;

    }
}