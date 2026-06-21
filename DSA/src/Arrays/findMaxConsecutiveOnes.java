class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxLength = 0;
         for(int i=0; i < nums.length; i++){
            if(nums[i]==1){ 
                
                count ++;
                maxLength = Math.max(count , maxLength);
            }
            else count=0;
         }
         return maxLength;
        
    }
}