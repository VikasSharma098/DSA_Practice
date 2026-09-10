//LCP686: Repeated String Match
//https://leetcode.com/problems/repeated-string-match/
class Solution {
    public int repeatedStringMatch(String a, String b) {
        int q = 1;
        StringBuilder sb = new StringBuilder(a);
        for (; sb.length() < b.length(); q++)
            sb.append(a);
        if (sb.indexOf(b) >= 0)
            return q;
        if (sb.append(a).indexOf(b) >= 0)
            return q + 1;
        return -1;
    }
}