class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb =new StringBuilder();
        for(char ch:s.toCharArray()){
            sb.append(ch);
            if(sb.length()>=part.length()){
                int st= sb.length()-part.length();
                if(sb.substring(st).equals(part)){
                    sb.delete(st,sb.length());
                }
            }
        }
      return sb.toString();  
    }
}