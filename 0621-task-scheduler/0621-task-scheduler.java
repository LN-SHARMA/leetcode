class Solution {
    public int leastInterval(char[] tasks, int n) {
        int N = tasks.length; int maxf=0;int maxC=0;
        int[] freq  =new int[26];
        for(char t: tasks){
            freq[t-'A']++;
        }
        for(int f:freq){
            maxf= Math.max(maxf,f);
        }
        for(int f:freq){
            if(f==maxf){
                maxC++;
            }
        }
        int ans= (maxf-1)*(n+1)+maxC;
        return Math.max(N,ans);

        
        
    }
}