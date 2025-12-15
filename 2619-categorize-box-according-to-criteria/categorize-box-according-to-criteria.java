class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long vol = (long)length*width*height;
        long bulky = 0;
        long heavy = 0;
        if(vol>=Math.pow(10,9) || length>=Math.pow(10,4) || width>=Math.pow(10,4) || height>=Math.pow(10,4)){
            bulky = vol;
        }
        if(mass>=100){
            heavy = mass;
        }
        if(bulky==vol && heavy==mass){
            return "Both";
        }else if(bulky!=vol && heavy!=mass){
            return "Neither";
        }else if(bulky==vol && heavy!=mass){
            return "Bulky";
        }else if(bulky!=vol && heavy==mass){
            return "Heavy";
        }
        return "t";
    }
}