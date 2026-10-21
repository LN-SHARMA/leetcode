class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n =arr.length; int c=0;
        for(int i=0;i<=n-k;i++){
            int j=i;
            int sum=0;
            while(j<i+k){
                sum +=arr[j];
                j++;
            
            }
            if(sum>=k*threshold){
                c++;
            }

        }
      return c;  
    }
}