class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] nums = new int[n+m];
        int k=0;int i=0; int j=0;
        while(i<n && j<m){
            if(nums1[i]<=nums2[j]){
                nums[k++]=nums1[i];  i++;
            }
            else{
                nums[k++]=nums2[j]; j++;
            }
            
        }
        while(i<n){
            nums[k++]=nums1[i++];
        }
        while(j<m){
            nums[k++]=nums2[j++];
        }
        if((m+n)%2!=0){
            int mid= (m+n)/2;
            return nums[mid];
        }
        else{
            int mid = (m+n)/2;
            int mid1= mid-1;
            return (nums[mid]+nums[mid1])/2.0;
        }
    }
}