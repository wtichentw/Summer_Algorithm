public class Solution {
    public int missingNumber(int[] nums) {
        if(nums == null) {
            return 0;
        }
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing ^= (i ^ nums[i]);
        }
        return missing;
        
        
        // using (1+n)n / 2 may cause overflow
    }
}
