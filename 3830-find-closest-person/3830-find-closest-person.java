class Solution {
    public int findClosest(int x, int y, int z) {
        if(x>=z){
            x=x-z;
        }else{
            x=z-x;
        }
        if(y>=z){
            y=y-z;
        }else{
            y=z-y;
        }
        if(x>y){
            return 2;
        }else if(y>x){
            return 1;
        }
        return 0;
    }
}