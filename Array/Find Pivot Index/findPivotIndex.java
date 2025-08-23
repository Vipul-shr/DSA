class Solution {
    public int pivotIndex(int[] nums) {
        int rightSum=0, leftSum=0;
        for(int i:nums)
            rightSum+=i;

        for(int j=0;j<nums.length;j++){
            rightSum-=nums[j];
            if(rightSum==leftSum){
                return j;
            }
            leftSum+=nums[j];
        }
        return -1;
    }
}
