class Solution {
    public double myPow(double x, int n) {
        // base case
        if(n==0){
            return 1;
        }
        if(n==1){
            return x;
        }
        
        
        double ans = 0;
        // for positive power
        if(n>1){
            ans = myPow(x , n/2);
            // if n is even then
            if(n%2 == 0){
                return ans*ans;
            }
            // n is odd
            else{
                return x*ans*ans;
            }
        }
        // for negative power
        else{
            ans = 1/myPow(1/x,n/2);
            if(n%2 == 0){
                return ans*ans;
            }
            else{
                return (1/x)*ans*ans;
            }
        }
            
        
    }
}