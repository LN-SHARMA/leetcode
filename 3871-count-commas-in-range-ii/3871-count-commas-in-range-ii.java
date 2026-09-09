class Solution {
    public long countCommas(long n){
        long ans = 0;
        if (n >= 1000){
            ans += (Math.min(n, 999999L) - 999);
        }
        if (n >=1000000){
            ans += (Math.min(n, 999999999L) - 999999)*2;
        }
        if (n >= 1000000000L){
            ans += (Math.min(n,999999999999L) - 999999999L)*3;
        }
        if (n >= 1000000000000L){
            ans += (Math.min(n, 999999999999999L) - 999999999999L)*4;
        }
        if (n >= 1000000000000000L){
            ans += (n - 999999999999999L)*5;
        }
        return ans;
    }
}