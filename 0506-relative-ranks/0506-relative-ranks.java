class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[] copy = score.clone();
        Arrays.sort(copy);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i<n; i++){
            map.put(copy[n-1-i],i+1);
        }
        String[] ans = new String[n];
        for(int i = 0; i<n; i++){
            int r = map.get(score[i]);
            if(r==1){
                ans[i]="Gold Medal";
            }
            else if(r==2){
                ans[i] = "Silver Medal";
            }
            else if(r==3){
                ans[i] = "Bronze Medal";
            }
            else{
                ans[i]= String.valueOf(r);
            }
        }
        
        
     return ans;   
    }
}