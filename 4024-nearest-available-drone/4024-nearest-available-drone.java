class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int m = drones.length;
        int nearest = Integer.MAX_VALUE;
        int ans =-1;
        for(int i =0;i<m;i++){
            int x = drones[i][0];
            int y = drones[i][1];
            int range = drones[i][2];
            int dist = Math.abs(x-target[0])+Math.abs(y-target[1]);
            if(dist<=range){
                if(dist<nearest){
                    nearest = dist;
                    ans =i;
                }
            }
        }

     return ans;   
    }
}