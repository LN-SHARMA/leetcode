class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean[] current = new boolean[101];
        for(int num: nums){
            current[num] = true;
            min = Math.min(min,num);
            max = Math.max(max,num);
        }
        List<Integer> ans =new ArrayList<>();
        for(int i =min; i<=max;i++){
            if(!current[i]){
                ans.add(i);

            }
        }
     return ans;   
    }
}