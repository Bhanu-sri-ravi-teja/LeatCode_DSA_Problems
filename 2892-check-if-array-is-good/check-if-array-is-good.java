class Solution {
    public boolean isGood(int[] nums) {
        
        
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        if (nums.length != (max + 1)) {
            return false;
        }
        int temp = 1;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] != temp){
                return false;
            }
            temp++;
        }
        if(nums[nums.length-1] != --temp){
            return false;
        }
        return true;
    }
}