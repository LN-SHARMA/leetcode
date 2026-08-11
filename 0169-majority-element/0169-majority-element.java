class Solution {
    public int majorityElement(int[] nums) {

        int ans = 0;
        int c = 0;
        for(int num : nums){
            if(c==0){
                ans = num;
            }
            if(num == ans){
                c++;
            }
            else{
                c--;
            }
        }

     return ans;
    }
}