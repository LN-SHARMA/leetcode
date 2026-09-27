class Solution {
    public String reverseParentheses(String s) {
        int n= s.length();
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }
            else if(s.charAt(i)==')'){
                int j= st.pop();
                ans[i]=j;
                ans[j]=i;
            }
        }
        StringBuilder sb = new StringBuilder();
        int d =1;
        for(int i =0;i<n;i+=d){
            char ch = s.charAt(i);
            if(ch=='(' || ch==')'){
                i= ans[i];
                d = -d;
            }
            else{
                sb.append(ch);
            }
        }
     return sb.toString();   
    }
}