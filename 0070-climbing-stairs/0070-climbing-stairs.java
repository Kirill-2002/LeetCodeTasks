class Solution {
    public int climbStairs(int n) {
        if(n<3){
            return n;
        }
        int x1=1;
        int x2=2;
        int result=0;
        for(int i =3; i<=n; i++){
            result=x1+x2;
            x1=x2;
            x2=result;
        }
        return result;
    }
}