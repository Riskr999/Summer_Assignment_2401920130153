//maximum average subarray
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowsum = 0 ; double maxavg=0;
        if (nums == null || nums.length == 0 || k <= 0 || k > nums.length) {
        return 0.0; // or throw as per requirement
    }
        for(int i=0; i<k;i++){
            windowsum += nums[i];
            
            
        }
        double best = (double )windowsum/k;
       
        for(int R = k;R<nums.length;R++){
            windowsum +=nums[R];
            windowsum -= nums[R-k];
             maxavg = (double) windowsum / k;
             best = Math.max(best, maxavg);

    
        }

        return best;
    }
}
