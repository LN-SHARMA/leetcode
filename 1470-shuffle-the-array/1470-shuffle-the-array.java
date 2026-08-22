class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int i=0;
        int j =n;
        while(i<n){
            ans[2*i]=nums[i];
            ans[2*i+1]=nums[j];
            i++;
            j++;
        }
     return ans;   
    }
}