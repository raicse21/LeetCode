class Solution {
    public int singleNumber(int[] nums) {
        int[] a = new int[100000];
        int ans =0;
        for(int i=0;i<nums.length;i++){
            if(a[nums[i]]==0){
                a[nums[i]]=1;
            }else{
                ans = nums[i];
                break;
            }
        }
        return ans;
    }
}