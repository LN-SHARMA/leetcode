class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] san = new int[256];
        int[] tan = new int[256];
        for(int i=0;i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(san[c1]!=tan[c2]){
                return false;

            }
            san[c1]=i+1;
            tan[c2]=i+1;
        }
     return true;   
    }
}