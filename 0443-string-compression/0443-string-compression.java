class Solution {
    public int compress(char[] chars) {
        int i=0; int write=0;
        while(i<chars.length){
            int j=i; char ch = chars[i];
            while(j<chars.length && chars[j]==ch){ j++;}
            int c =j-i;
            chars[write++]=ch;
            if(c>1){
                String s= String.valueOf(c);
                for(char val:s.toCharArray()){
                    chars[write++]=val;
                }
            }
            i=j;
        }
     return write;   
    }
}