class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<n;i++){
            if(s.contains(nums[i])){
                return true;
            }
            else{
                s.add(nums[i]);
            }
        }
     return false;   
    }
}