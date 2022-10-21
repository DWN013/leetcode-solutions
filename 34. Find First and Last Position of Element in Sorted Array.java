//Find-first-and-last-position-of-element-in-sorted-array by Alexander Ukhin
class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] result = {-1, -1};
        int start  = 0;
        int end = 0;
        boolean firstNum = true;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target && firstNum){
                result[0] = i;
                result[1] = i;
                firstNum = false;
            }
            if(nums[i] == target && !firstNum){
                result[1] = i;
            }
        }
        
        return result;
        
    }
}
