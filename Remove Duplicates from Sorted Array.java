class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int i=0;
        int j=0;
        nums[i++]=nums[0];
        while(j<nums.length-1){
            if(nums[j]!=nums[j+1]){
                nums[i++]=nums[j+1];
            }
            j++;
        }
        return i;
    }
}