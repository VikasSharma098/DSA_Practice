class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long x = mass;
        for (int i : asteroids) {
            if (x < i) {
                return false;

            }
            x += i;
        }
        return true;

    }
}