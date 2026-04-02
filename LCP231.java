class Solution {
    public boolean isPowerOfTwo(int n) {
         double x = Math.log10(n)/Math.log10(2);
         if(x%1==0) return true;
         return false;

        
    }
}
