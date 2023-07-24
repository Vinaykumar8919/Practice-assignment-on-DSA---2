class Solution {
    public int jump(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return minstep(0,nums,dp);
    }
    int minstep(int i,int[] nums,int dp[]){
        if(i==nums.length-1){
            return 0;
        }
        int min=Integer.MAX_VALUE;
        int x=Integer.MAX_VALUE;
        int a=0;
        if(dp[i]!=-1){
            return dp[i];
        }
        for(int j=1;j<=nums[i];j++){
            if(i+j<nums.length){
                x=1;
                a=minstep(i+j,nums,dp);
                if(a!=Integer.MAX_VALUE){
                    x=x+a;
                }
                else{
                    x=Integer.MAX_VALUE;
                }
                min=Math.min(min,x);
            }
        }
        return dp[i]=min;
    }
}