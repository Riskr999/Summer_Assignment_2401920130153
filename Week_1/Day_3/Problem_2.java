// container with most water
class Solution {
    public int maxArea(int[] h) {
    int L = 0, R = h.length - 1, best = 0;
    while (L < R) {
        int area = Math.min(h[L], h[R]) * (R - L);
        best = Math.max(best, area);
        if (h[L] < h[R]) L++;  // move shorter side
        else R--;
    }
    return best;
 }

}
