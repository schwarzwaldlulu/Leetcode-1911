// using dynamic programming

// the array dp keeps track of the max alternating sum, i.e.
// dp[i] is the max alternating sum for subarray of nums from 0 to i;
class Leetcode1911 {
    public static long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long dp[] = new long[n];
        dp[0] = nums[0];
        for ( int i = 1; i < n; ++i ) {
            dp[i] = dp[i-1] + Math.max( 0, nums[i]-nums[i-1] );
        }
        return dp[n-1];
        
    }
  
  public static void main( String[] args ) {
		int[] nums = new int[] { 5, 6, 7, 8 };
		System.out.println( "the maximum alternating sum of nums is " + maxAlternatingSum( nums ) );
	}

}
