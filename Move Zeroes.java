class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
             nums[i++] = nums[j];   
            }
        }
        int l = nums.length-i;
        for(int k=1;k<=l;k++){
            nums[nums.length-k]=0;
        }
    }
}