class Solution {
    public boolean isPowerOfFour(int n) {
        double x = Math.log10(n)/Math.log10(4);
        if(x%1==0) return true;
        return false;
        
    }
}
