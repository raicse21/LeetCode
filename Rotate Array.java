class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length <= 1 || nums == null ) return;
        int len = nums.length;
        k = k%len;
        reverse(nums,0,len-1);
        reverse(nums,0,k-1);
        reverse(nums,k,len-1);
    }
    
    public void reverse(int[] a , int start , int end) {
        while(start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
}