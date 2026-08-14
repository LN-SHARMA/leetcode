class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l=0;
        int r =n-1;
        int area=0;
        while(l<r){
            int current_area=(r-l)*Math.min(height[l],height[r]);
            area = Math.max(area,current_area);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
    return area;    
    }
}