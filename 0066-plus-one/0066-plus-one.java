class Solution {
    public int[] plusOne(int[] digits) {
        int flag =1;

        for(int i = digits.length-1; i>=0; i--){
            if(digits[i]+flag==10){
                flag = 1;
                digits[i]=0;
            }else if (digits[i]+flag!=10 && flag == 1) {
                 digits[i]= digits[i]+1;
                 flag=0;
            }

            if(i==0 && flag==1){
                int [] result= new int[digits.length+1];
                result[0]=1;
                return result;

            }
        }

        return digits;
    }
}