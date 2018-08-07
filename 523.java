class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums == null || nums.length < 2) {
            return false;
        }
        //key : sum, value: index
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int runningSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            if (k != 0) {
                runningSum %= k;
            }
            if (map.containsKey(runningSum)) {
                if (i - map.get(runningSum) >= 2) {
                    return true;
                }
            } else {
                map.put(runningSum, i);
            }            
        }
        
        return false;
    }
}
