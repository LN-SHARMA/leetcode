class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length; int max=0; int min =0;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[min]){
                min=i;
            }
            if(nums[i]>nums[max]){
                max=i;
            }
        }
        if(min>max){
            int temp =min;
            min =max;
            max=temp;
        }
        int r =n-min;
        int l=max+1;
        int both = (min+1)+(n-max);
        return Math.min(l,Math.min(r,both));
        
    }
}