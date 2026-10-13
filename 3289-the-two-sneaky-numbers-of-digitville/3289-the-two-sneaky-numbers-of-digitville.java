class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] feq =new int[nums.length-2];
        int[] ans= new int[2]; int j=0;
        for(int num: nums){
            feq[num]++;
            if(feq[num] ==2){
                ans[j++]=num;
            }
        }
        return ans;
    }
}