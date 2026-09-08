class Solution {
    public boolean uniformArray(int[] nums1) {
        int odd = Integer.MAX_VALUE;
        for(int n: nums1){
            if(n%2!=0){
                odd = Math.min(n,odd);
            }
        }
        if(odd==Integer.MAX_VALUE){
            return true;
        }
        for(int n: nums1){
            if(n%2==0 && n<odd){
                return false;
            }
        }
       return true; 
    }
}