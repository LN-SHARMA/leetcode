class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> s=new HashSet<>();
        while(n!=1){
            if(s.contains(n)){return false;}
            s.add(n);
            int ans=0;
            while(n>0){
                int dig =n%10;
                ans += dig*dig;
                n/=10;
            }
            n=ans;
        }
     return true;   
    }
}