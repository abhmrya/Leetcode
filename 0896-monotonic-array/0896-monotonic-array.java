class Solution {
    public boolean isMonotonic(int[] nums) {
        
        boolean increase=false;
        boolean decrease = false;
        for(int i = 1; i<nums.length; i++){
            if(increase==true && decrease==true){
                return false;
            }
            if(nums[i]>nums[i-1]){
                increase=true;
            }
            if(nums[i]<nums[i-1]){
                decrease=true;
            }
        }
        if(increase==true && decrease==true){
            return false;
        }
        return true;
    }
}