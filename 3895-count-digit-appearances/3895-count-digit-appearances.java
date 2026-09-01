class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int n = nums.length;
        int c=0;
        for(int i =0;i<n;i++){
            int x = nums[i];
            while(x>0){
            int dig = x%10;
            x/=10;
            if(dig==digit){
                c++;
            }
            }
        }
     return c;   
    }
}