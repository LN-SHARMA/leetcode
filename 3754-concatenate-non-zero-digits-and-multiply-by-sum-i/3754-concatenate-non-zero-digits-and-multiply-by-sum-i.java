class Solution {
    public long sumAndMultiply(int n) {
        long rev =0 ;
        long sum =0;
        long x =0;
        while(n>0){
            int dig = n%10;
            if(dig !=0){
                rev = rev*10 +dig;
            }

            sum = sum + dig;
            n /= 10;
        }
        while(rev>0){
            long dig = rev%10;
            x = x*10 +dig;
            rev /= 10;

        }
        return x*sum;
        
    }
}