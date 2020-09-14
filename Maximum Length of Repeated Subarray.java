class Solution {
    public int findLength(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        int[][] dp = new int[m+1][n+1];
        int ans = 0;
        for(int i=m-1 ;i>=0;i--){
            for(int j=n-1; j>=0 ;j--){
                if(A[i] == B[j]){
                    dp[i][j] = 1+ dp[i+1][j+1];
                    ans = Math.max(ans,dp[i][j]);
                }
            }
        }
       
        return ans;
    }
}