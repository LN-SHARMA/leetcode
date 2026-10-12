class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long vol = (long)length*width*height; int n=10000;
        boolean heavy=false; boolean bulky=false;
        if(length>=n || width>=n || height>=n || vol>=1000000000){bulky =true;}
        if(mass >=100){heavy = true;}
        if(bulky && heavy){return "Both";}
        else if(bulky){return "Bulky";}
        else if(heavy){return "Heavy";}
        else{return "Neither";}


        
    }
}