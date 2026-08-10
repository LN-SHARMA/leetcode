class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i =0;
        while(i<words.length){
            int j = i;
            int letter = 0;
            while(j<words.length && letter + words[j].length() + (j-i)<=maxWidth){
                letter += words[j].length();
                j++;
            }
            int wordCount = j-i;
            int spaces = maxWidth - letter;
            StringBuilder line = new StringBuilder();

            if(wordCount == 1|| j== words.length){
                for(int k =i; k<j;k++){
                    line.append(words[k]);
                    if(k<j-1){
                        line.append(" ");
                    }

                }
                while(line.length()<maxWidth){
                    line.append(" ");
                }
                
            }
            else{
                int gap = wordCount-1;
                int eachspace = spaces/gap;
                int extraSpace = spaces%gap;
                for(int k = i; k<j; k++){
                    line.append(words[k]);
                    if(k<j-1){
                        for(int m =0; m<eachspace; m++){
                            line.append(" ");

                        }
                        if(extraSpace>0){
                           line.append(" ");
                           extraSpace--;
                        }
                           
                    }
                    
                }

            }
            result.add(line.toString());
            i=j;

        
        }
     return result;   
    }
}