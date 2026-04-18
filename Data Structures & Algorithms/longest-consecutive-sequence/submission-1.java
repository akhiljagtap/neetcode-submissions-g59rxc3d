class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int curLen = 1;
        int maxLen = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]) continue;
            if(nums[i] == nums[i-1] + 1){
                curLen+=1;
            }else{
                curLen = 1;
            }
            maxLen = Math.max(maxLen, curLen);
        }
        return maxLen;

    }
}
