class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> s = new HashSet<>();
        int n = nums.length;
        for(int i =0;i<n;i++){
            s.add(nums[i]);
        }
        for(int i=1;i<=n+1;i++){
            int ans = k*i;
            if(!s.contains(ans)){
                return ans;
            }
        }
     return -1;   
    }
}