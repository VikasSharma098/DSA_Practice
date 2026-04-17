class Solution {
    public int titleToNumber(String columnTitle) {
        long r = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            char ch = columnTitle.charAt(i);
            r = r * 26 + (ch - 'A' + 1);
        }

        return (int) r;

    }
}