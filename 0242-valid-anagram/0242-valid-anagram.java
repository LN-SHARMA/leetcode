class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] san = new int[26];
        int[] tan =new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            san[ch-'a']++;
        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            tan[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(san[i]!=tan[i]){
                return false;
            }
        }
     return true;   
    }
}