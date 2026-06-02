class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int index = 0;
        for(int n : nums){

           int complement = target - n;
        
        if (map.containsKey(complement)) {
            return new int[] { map.get(complement), index };
        }
        map.put(n,index);
        index++;
        }
         return new int[] {};
    }
    
   


}
